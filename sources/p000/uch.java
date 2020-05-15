package p000;

import android.content.Context;

/* renamed from: uch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class uch extends ucg {
    protected uch(String str, ubk ubk, uto uto) {
        super(str, ubk, uto);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        if (this.f47237a.mo27097f()) {
            mo27234d(context);
            return;
        }
        throw new aaaj(10, "App is not authorized to make this request.");
    }

    /* renamed from: d */
    public abstract void mo27234d(Context context);

    protected uch(String str, ubk ubk, uto uto, int i) {
        super(str, ubk, uto, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ucg.<init>(java.lang.String, ubk, uto, int, boolean):void
     arg types: [java.lang.String, ubk, uto, int, int]
     candidates:
      ucg.<init>(java.lang.String, ubk, uto, vcy, boolean):void
      ucg.<init>(java.lang.String, ubk, uto, int, boolean):void */
    protected uch(String str, ubk ubk, uto uto, int i, byte[] bArr) {
        super(str, ubk, uto, i, false);
    }
}
