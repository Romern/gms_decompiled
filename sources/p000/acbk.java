package p000;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: acbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acbk extends acbi {

    /* renamed from: c */
    private final Map f59440c;

    public acbk(String str, Map map) {
        super(str);
        this.f59440c = map;
    }

    /* renamed from: b */
    public static abur m48822b(String str) {
        bxvd da = abur.f58453f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abur abur = (abur) da.f164949b;
        str.getClass();
        abur.f58455a |= 1;
        abur.f58456b = str;
        return (abur) da.mo74062i();
    }

    /* renamed from: b */
    public static boolean m48823b(char c) {
        if (c < 'a' || c > 'z') {
            return (c >= 'A' && c <= 'Z') || c == '_';
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m48824c(char c) {
        return m48823b(c) || acbi.m48813a(c);
    }

    /* renamed from: a */
    public final int mo32614a(acbh acbh) {
        Integer num = (Integer) this.f59440c.get(((acbj) acbh.f59435b).f59439a);
        if (num != null) {
            return num.intValue();
        }
        throw mo32607a("Corpus doesn't have section with such name.", acbh.f59434a);
    }

    /* renamed from: g */
    public final acbh mo32617g() {
        if (!mo32608a()) {
            mo32609b();
            if (mo32612e() == '$') {
                mo32611d();
            }
            if (mo32608a() || !m48823b(mo32612e())) {
                throw mo32607a("Expected a name", this.f59437b);
            }
            mo32611d();
            while (!mo32608a() && m48824c(mo32612e())) {
                mo32611d();
            }
            acbh c = mo32610c();
            return new acbh(c.f59434a, new acbj((String) c.f59435b));
        }
        throw mo32606a("Expected a name or $");
    }

    /* renamed from: h */
    public final acbh mo32618h() {
        mo32613f();
        if (!mo32608a()) {
            char e = mo32612e();
            int i = 0;
            if (acbi.m48813a(e) || e == '-') {
                mo32613f();
                mo32609b();
                if (!mo32608a() && mo32612e() == '-') {
                    mo32611d();
                }
                while (!mo32608a() && acbi.m48813a(mo32612e())) {
                    mo32611d();
                    i++;
                }
                if (i != 0) {
                    return new acbh(this.f59437b, Integer.valueOf((String) mo32610c().f59435b));
                }
                throw mo32607a("Expected an integer", this.f59437b);
            } else if (m48823b(e) || e == '$') {
                return mo32617g();
            } else {
                if (e == '\"') {
                    mo32611d();
                    int i2 = this.f59436a;
                    StringBuilder sb = new StringBuilder();
                    mo32609b();
                    while (!mo32608a() && mo32612e() != '\"') {
                        if (mo32612e() == '\\') {
                            sb.append((String) mo32610c().f59435b);
                            mo32611d();
                            if (!mo32608a()) {
                                char e2 = mo32612e();
                                if (e2 == '\"' || e2 == '\\') {
                                    mo32609b();
                                } else {
                                    throw mo32606a("Expected \" or \\");
                                }
                            } else {
                                throw mo32606a("Expected an escape sequence");
                            }
                        }
                        mo32611d();
                    }
                    if (!mo32608a()) {
                        sb.append((String) mo32610c().f59435b);
                        mo32611d();
                        return new acbh(i2, sb.toString());
                    }
                    throw mo32606a("Expected string literal end");
                } else if (e == '(') {
                    int i3 = this.f59436a;
                    ArrayList arrayList = new ArrayList();
                    do {
                        boolean z = true;
                        if (mo32608a() || !(mo32612e() == '(' || mo32612e() == ',')) {
                            z = false;
                        }
                        sdo.m34970a(z);
                        mo32611d();
                        mo32613f();
                        if (mo32608a() || mo32612e() == ')') {
                            break;
                        }
                        arrayList.add(mo32618h());
                        mo32613f();
                        if (mo32608a()) {
                            break;
                        }
                    } while (mo32612e() == ',');
                    if (mo32608a() || mo32612e() != ')') {
                        throw mo32606a("Expected )");
                    }
                    mo32611d();
                    return new acbh(i3, arrayList);
                } else {
                    throw mo32606a("Expected a value");
                }
            }
        } else {
            throw mo32606a("Expected a value");
        }
    }

    /* renamed from: a */
    public final int mo32615a(Pair pair) {
        if (pair.second == null) {
            throw mo32607a("length must specify a value", ((acbh) pair.first).f59434a);
        } else if (((acbh) pair.second).f59435b instanceof Integer) {
            int intValue = ((Integer) ((acbh) pair.second).f59435b).intValue();
            if (intValue > 0) {
                return intValue;
            }
            throw mo32607a("length must be greater than zero", ((acbh) pair.second).f59434a);
        } else {
            throw mo32607a("Expected an integer", ((acbh) pair.second).f59434a);
        }
    }

    /* renamed from: b */
    public final boolean mo32616b(acbh acbh) {
        if (acbh == null) {
            return true;
        }
        Object obj = acbh.f59435b;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            if (intValue == 0) {
                return false;
            }
            if (intValue == 1) {
                return true;
            }
            throw mo32607a("Expected a boolean", acbh.f59434a);
        } else if (obj instanceof acbj) {
            String str = ((acbj) obj).f59439a;
            if ("true".equals(str)) {
                return true;
            }
            if ("false".equals(str)) {
                return false;
            }
            throw mo32607a("Expected a boolean", acbh.f59434a);
        } else {
            throw mo32607a("Expected a boolean", acbh.f59434a);
        }
    }
}
