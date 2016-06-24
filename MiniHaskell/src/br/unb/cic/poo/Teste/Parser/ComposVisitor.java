package Parser;
import Parser.Absyn.*;
/** BNFC-Generated Composition Visitor
*/

public class ComposVisitor<A> implements
  Parser.Absyn.Exp.Visitor<Parser.Absyn.Exp,A>
{
/* Exp */
    public Exp visit(Parser.Absyn.EAdd p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);

      return new Parser.Absyn.EAdd(exp_1, exp_2);
    }
    public Exp visit(Parser.Absyn.ESub p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);

      return new Parser.Absyn.ESub(exp_1, exp_2);
    }
    public Exp visit(Parser.Absyn.EMul p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);

      return new Parser.Absyn.EMul(exp_1, exp_2);
    }
    public Exp visit(Parser.Absyn.EDiv p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);

      return new Parser.Absyn.EDiv(exp_1, exp_2);
    }
    public Exp visit(Parser.Absyn.EInt p, A arg)
    {
      Integer integer_ = p.integer_;

      return new Parser.Absyn.EInt(integer_);
    }

}