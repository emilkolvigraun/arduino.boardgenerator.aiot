package org.xtext.mdsd.arduino.boardgenerator.generator;

import java.util.Arrays;
import java.util.HashMap;
import org.xtext.mdsd.arduino.boardgenerator.ioT.And;
import org.xtext.mdsd.arduino.boardgenerator.ioT.BooleanLiteral;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Conditional;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Div;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Equal;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Exponent;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Expression;
import org.xtext.mdsd.arduino.boardgenerator.ioT.GreaterThan;
import org.xtext.mdsd.arduino.boardgenerator.ioT.GreaterThanEqual;
import org.xtext.mdsd.arduino.boardgenerator.ioT.LessThan;
import org.xtext.mdsd.arduino.boardgenerator.ioT.LessThanEqual;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Minus;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Mul;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Negation;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Not;
import org.xtext.mdsd.arduino.boardgenerator.ioT.NumberLiteral;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Or;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Plus;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Reference;
import org.xtext.mdsd.arduino.boardgenerator.ioT.StringLiteral;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Unequal;

@SuppressWarnings("all")
public class ExpressionParser {
  protected String _getExpression(final Expression expression, final HashMap<String, String> env) {
    return this.getExpression(expression, env).toString();
  }
  
  protected String _getExpression(final Conditional condition, final HashMap<String, String> env) {
    String _expression = this.getExpression(condition.getCondition(), env);
    String _plus = (_expression + "?");
    String _expression_1 = this.getExpression(condition.getCorrect(), env);
    String _plus_1 = (_plus + _expression_1);
    String _plus_2 = (_plus_1 + ":");
    String _expression_2 = this.getExpression(condition.getIncorrect(), env);
    return (_plus_2 + _expression_2);
  }
  
  protected String _getExpression(final Or or, final HashMap<String, String> env) {
    String _expression = this.getExpression(or.getLeft(), env);
    String _plus = (_expression + "||");
    String _expression_1 = this.getExpression(or.getRight(), env);
    return (_plus + _expression_1);
  }
  
  protected String _getExpression(final And and, final HashMap<String, String> env) {
    String _expression = this.getExpression(and.getLeft(), env);
    String _plus = (_expression + "&&");
    String _expression_1 = this.getExpression(and.getRight(), env);
    return (_plus + _expression_1);
  }
  
  protected String _getExpression(final Equal equal, final HashMap<String, String> env) {
    String _expression = this.getExpression(equal.getLeft(), env);
    String _plus = (_expression + "==");
    String _expression_1 = this.getExpression(equal.getRight(), env);
    return (_plus + _expression_1);
  }
  
  protected String _getExpression(final Unequal unequal, final HashMap<String, String> env) {
    String _expression = this.getExpression(unequal.getLeft(), env);
    String _plus = (_expression + "!=");
    String _expression_1 = this.getExpression(unequal.getLeft(), env);
    return (_plus + _expression_1);
  }
  
  protected String _getExpression(final LessThan less, final HashMap<String, String> env) {
    String _expression = this.getExpression(less.getLeft(), env);
    String _plus = (_expression + "<");
    String _expression_1 = this.getExpression(less.getRight(), env);
    return (_plus + _expression_1);
  }
  
  protected String _getExpression(final LessThanEqual less, final HashMap<String, String> env) {
    String _expression = this.getExpression(less.getLeft(), env);
    String _plus = (_expression + "<=");
    String _expression_1 = this.getExpression(less.getRight(), env);
    return (_plus + _expression_1);
  }
  
  protected String _getExpression(final GreaterThan greater, final HashMap<String, String> env) {
    String _expression = this.getExpression(greater.getLeft(), env);
    String _plus = (_expression + ">");
    String _expression_1 = this.getExpression(greater.getRight(), env);
    return (_plus + _expression_1);
  }
  
  protected String _getExpression(final GreaterThanEqual greater, final HashMap<String, String> env) {
    String _expression = this.getExpression(greater.getLeft(), env);
    String _plus = (_expression + ">=");
    String _expression_1 = this.getExpression(greater.getRight(), env);
    return (_plus + _expression_1);
  }
  
  protected String _getExpression(final Plus plus, final HashMap<String, String> env) {
    String _expression = this.getExpression(plus.getLeft(), env);
    String _plus = (_expression + "+");
    String _expression_1 = this.getExpression(plus.getRight(), env);
    return (_plus + _expression_1);
  }
  
  protected String _getExpression(final Minus minus, final HashMap<String, String> env) {
    String _expression = this.getExpression(minus.getLeft(), env);
    String _plus = (_expression + "-");
    String _expression_1 = this.getExpression(minus.getRight(), env);
    return (_plus + _expression_1);
  }
  
  protected String _getExpression(final Mul mul, final HashMap<String, String> env) {
    String _expression = this.getExpression(mul.getLeft(), env);
    String _plus = (_expression + "*");
    String _expression_1 = this.getExpression(mul.getRight(), env);
    return (_plus + _expression_1);
  }
  
  protected String _getExpression(final Div div, final HashMap<String, String> env) {
    String _expression = this.getExpression(div.getLeft(), env);
    String _plus = (_expression + "/");
    String _expression_1 = this.getExpression(div.getRight(), env);
    return (_plus + _expression_1);
  }
  
  protected String _getExpression(final Negation neg, final HashMap<String, String> env) {
    String _expression = this.getExpression(neg.getValue(), env);
    return ("-" + _expression);
  }
  
  protected String _getExpression(final Exponent exponent, final HashMap<String, String> env) {
    String _expression = this.getExpression(exponent.getBase(), env);
    String _plus = (_expression + "**");
    String _expression_1 = this.getExpression(exponent.getPower(), env);
    return (_plus + _expression_1);
  }
  
  protected String _getExpression(final Not not, final HashMap<String, String> env) {
    String _expression = this.getExpression(not.getValue(), env);
    return ("!" + _expression);
  }
  
  protected String _getExpression(final Reference reference, final HashMap<String, String> env) {
    return env.get(reference.getRef().toString()).toString();
  }
  
  protected String _getExpression(final NumberLiteral number, final HashMap<String, String> env) {
    return number.getNumb().toString();
  }
  
  protected String _getExpression(final BooleanLiteral bool, final HashMap<String, String> env) {
    return Boolean.valueOf(bool.isBool()).toString();
  }
  
  protected String _getExpression(final StringLiteral str, final HashMap<String, String> env) {
    String _string = str.getStr().toString();
    String _plus = ("\"" + _string);
    return (_plus + "\"");
  }
  
  public String getExpression(final Expression and, final HashMap<String, String> env) {
    if (and instanceof And) {
      return _getExpression((And)and, env);
    } else if (and instanceof BooleanLiteral) {
      return _getExpression((BooleanLiteral)and, env);
    } else if (and instanceof Conditional) {
      return _getExpression((Conditional)and, env);
    } else if (and instanceof Div) {
      return _getExpression((Div)and, env);
    } else if (and instanceof Equal) {
      return _getExpression((Equal)and, env);
    } else if (and instanceof Exponent) {
      return _getExpression((Exponent)and, env);
    } else if (and instanceof GreaterThan) {
      return _getExpression((GreaterThan)and, env);
    } else if (and instanceof GreaterThanEqual) {
      return _getExpression((GreaterThanEqual)and, env);
    } else if (and instanceof LessThan) {
      return _getExpression((LessThan)and, env);
    } else if (and instanceof LessThanEqual) {
      return _getExpression((LessThanEqual)and, env);
    } else if (and instanceof Minus) {
      return _getExpression((Minus)and, env);
    } else if (and instanceof Mul) {
      return _getExpression((Mul)and, env);
    } else if (and instanceof Negation) {
      return _getExpression((Negation)and, env);
    } else if (and instanceof Not) {
      return _getExpression((Not)and, env);
    } else if (and instanceof NumberLiteral) {
      return _getExpression((NumberLiteral)and, env);
    } else if (and instanceof Or) {
      return _getExpression((Or)and, env);
    } else if (and instanceof Plus) {
      return _getExpression((Plus)and, env);
    } else if (and instanceof Reference) {
      return _getExpression((Reference)and, env);
    } else if (and instanceof StringLiteral) {
      return _getExpression((StringLiteral)and, env);
    } else if (and instanceof Unequal) {
      return _getExpression((Unequal)and, env);
    } else if (and != null) {
      return _getExpression(and, env);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(and, env).toString());
    }
  }
}
