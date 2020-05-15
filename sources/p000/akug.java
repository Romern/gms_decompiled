package p000;

import android.text.TextUtils;
import android.util.Log;
import java.text.ParseException;

/* renamed from: akug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class akug {
    protected akug() {
    }

    /* renamed from: a */
    protected static akpo m60483a(String str) {
        try {
            String[] split = str.split("x");
            if (split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                return akpo.m60217a(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
            sb.append("Incorrect format of string: expected \"WxH\", but was \"");
            sb.append(str);
            sb.append("\"");
            throw new ParseException(sb.toString(), -1);
        } catch (Exception e) {
            Log.e("OcrPhenotype", "Could not parse Phenotype-provided camera max preview size", e);
            return akpo.m60217a(1280, 960);
        }
    }

    /* renamed from: a */
    public abstract boolean mo39851a();

    /* renamed from: b */
    public abstract akpo mo39852b();

    /* renamed from: c */
    public abstract boolean mo39853c();

    /* renamed from: d */
    public abstract boolean mo39854d();

    /* renamed from: e */
    public abstract float mo39855e();

    /* renamed from: f */
    public abstract float mo39856f();

    /* renamed from: g */
    public abstract boolean mo39857g();

    /* renamed from: h */
    public abstract boolean mo39858h();

    /* renamed from: i */
    public abstract float mo39859i();

    /* renamed from: j */
    public abstract float mo39860j();

    /* renamed from: k */
    public abstract long mo39861k();

    /* renamed from: l */
    public abstract boolean mo39862l();

    /* renamed from: m */
    public aktz mo39863m() {
        throw new UnsupportedOperationException();
    }
}
