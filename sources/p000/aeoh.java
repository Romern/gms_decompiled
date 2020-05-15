package p000;

import java.util.Arrays;

/* renamed from: aeoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeoh implements aelt {

    /* renamed from: a */
    public final String f63564a;

    /* renamed from: b */
    public final int f63565b;

    /* renamed from: c */
    public final int f63566c;

    /* renamed from: d */
    public final CharSequence f63567d;

    /* renamed from: e */
    public final int f63568e;

    public aeoh(String str, int i, int i2, CharSequence charSequence, int i3) {
        this.f63564a = str;
        this.f63565b = i;
        this.f63566c = i2;
        this.f63567d = charSequence;
        this.f63568e = i3;
    }

    /* renamed from: a */
    public final int mo34309a() {
        return this.f63565b;
    }

    /* renamed from: b */
    public final int mo34311b() {
        return this.f63566c;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeoh) {
            aeoh aeoh = (aeoh) obj;
            return aeoh.f63565b == this.f63565b && aeoh.f63566c == this.f63566c && sdg.m34949a(aeoh.f63564a, this.f63564a) && sdg.m34949a(aeoh.f63567d, this.f63567d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f63565b), Integer.valueOf(this.f63566c), this.f63564a, this.f63567d});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final rke mo34310a(rkb rkb, int i, int i2) {
        boolean z;
        rjo rjo = aema.f63501a;
        sdo.m34966a(this, "photo == null");
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "width <= 0");
        if (i2 <= 0) {
            z2 = false;
        }
        sdo.m34975b(z2, "height <= 0");
        String str = this.f63564a;
        int i3 = this.f63568e;
        sdo.m34966a((Object) str, (Object) "fifeUrl == null");
        return rkb.mo24787a((rle) new aelf(aema.f63501a, rkb, str, i, i2, i3));
    }
}
