package Parser.Absyn; // Java Package generated by the BNF Converter.

public class EPar_Dir extends Exp {
  public final Exp exp_;

  public EPar_Dir(Exp p1) { exp_ = p1; }

  public <R,A> R accept(Parser.Absyn.Exp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof Parser.Absyn.EPar_Dir) {
      Parser.Absyn.EPar_Dir x = (Parser.Absyn.EPar_Dir)o;
      return this.exp_.equals(x.exp_);
    }
    return false;
  }

  public int hashCode() {
    return this.exp_.hashCode();
  }


}