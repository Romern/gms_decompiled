package p000;

import java.util.Arrays;

/* renamed from: cidu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cidu extends chsp {

    /* renamed from: a */
    public final chqo f189932a;

    /* renamed from: b */
    public final chtr f189933b;

    /* renamed from: c */
    public final chtv f189934c;

    public cidu(chtv chtv, chtr chtr, chqo chqo) {
        bmxy.m108582a(chtv, "method");
        this.f189934c = chtv;
        bmxy.m108582a(chtr, "headers");
        this.f189933b = chtr;
        bmxy.m108582a(chqo, "callOptions");
        this.f189932a = chqo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cidu cidu = (cidu) obj;
            return bmxi.m108538a(this.f189932a, cidu.f189932a) && bmxi.m108538a(this.f189933b, cidu.f189933b) && bmxi.m108538a(this.f189934c, cidu.f189934c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f189932a, this.f189933b, this.f189934c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f189934c);
        String valueOf2 = String.valueOf(this.f189933b);
        String valueOf3 = String.valueOf(this.f189932a);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 31 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("[method=");
        sb.append(valueOf);
        sb.append(" headers=");
        sb.append(valueOf2);
        sb.append(" callOptions=");
        sb.append(valueOf3);
        sb.append("]");
        return sb.toString();
    }
}
