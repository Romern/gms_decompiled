package p000;

import android.content.ContentValues;

/* renamed from: auml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class auml {

    /* renamed from: d */
    public final String f92085d;

    /* renamed from: e */
    protected final ContentValues f92086e;

    protected auml() {
        this("model_id");
    }

    /* renamed from: a */
    public final ContentValues mo50670a() {
        return new ContentValues(this.f92086e);
    }

    protected auml(String str) {
        this(str, new ContentValues());
    }

    /* renamed from: a */
    public final Object mo50671a(aumy aumy) {
        return aumy.f92122c.mo50684a(this.f92086e, aumy.f92120a, aumy.f92121b);
    }

    protected auml(String str, ContentValues contentValues) {
        sdo.m34977c(str);
        this.f92085d = str;
        this.f92086e = contentValues;
    }

    /* renamed from: a */
    public final void mo50672a(aumy aumy, Object obj) {
        aumy.f92122c.mo50689b(this.f92086e, aumy.f92120a, obj);
    }
}
