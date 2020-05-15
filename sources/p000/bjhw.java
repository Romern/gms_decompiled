package p000;

import android.text.TextUtils;

/* renamed from: bjhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bjhw extends bjhs {

    /* renamed from: d */
    public String f122753d = "";

    public bjhw(bxuq bxuq) {
        super(bxuq);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo65241a(int i) {
        return this.f122753d;
    }

    /* renamed from: c */
    public boolean mo65250c() {
        return TextUtils.isEmpty(this.f122753d);
    }

    /* renamed from: a */
    public final void mo65246a(Object obj) {
        mo65262a(obj != null ? String.valueOf(obj) : "");
    }

    /* renamed from: a */
    public final void mo65262a(String str) {
        mo65263a(str, null);
    }

    /* renamed from: a */
    public void mo65263a(String str, bjgf bjgf) {
        if (!TextUtils.equals(str, this.f122753d)) {
            this.f122753d = str;
            mo65244a(bjgf);
        }
    }
}
