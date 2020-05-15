package p000;

import android.text.TextUtils;

/* renamed from: pix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pix implements pud {

    /* renamed from: a */
    final /* synthetic */ pjc f39257a;

    public pix(pjc pjc) {
        this.f39257a = pjc;
    }

    /* renamed from: a */
    public final long mo23227a() {
        return pjc.f39271d.incrementAndGet();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pjc.a(java.lang.String, java.lang.Object, long, java.lang.String):void
     arg types: [java.lang.String, java.lang.String, long, java.lang.String]
     candidates:
      pjc.a(java.lang.String, java.lang.String, long, java.lang.String):void
      pjc.a(java.lang.String, byte[], long, java.lang.String):void
      pil.a(java.lang.String, java.lang.String, long, java.lang.String):void
      pjc.a(java.lang.String, java.lang.Object, long, java.lang.String):void */
    /* renamed from: b */
    public final void mo23231b(String str, String str2, long j, String str3) {
        String str4;
        pjc pjc = this.f39257a;
        if (TextUtils.isEmpty(str3)) {
            str4 = this.f39257a.mo23261o();
        } else {
            str4 = str3;
        }
        pjc.mo23241a(str, (Object) str2, j, str4);
    }

    /* renamed from: a */
    public final void mo23228a(String str, String str2, long j, String str3) {
        String str4;
        pjc pjc = this.f39257a;
        if (TextUtils.isEmpty(str3)) {
            str4 = this.f39257a.mo23261o();
        } else {
            str4 = str3;
        }
        pjc.mo23204a(str, str2, j, str4);
    }

    /* renamed from: a */
    public final void mo23229a(String str, byte[] bArr, long j, String str2) {
        String str3;
        pjc pjc = this.f39257a;
        if (TextUtils.isEmpty(str2)) {
            str3 = this.f39257a.mo23261o();
        } else {
            str3 = str2;
        }
        pjc.mo23242a(str, bArr, j, str3);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pjc.a(java.lang.String, java.lang.Object, long, java.lang.String):void
     arg types: [java.lang.String, byte[], int, java.lang.String]
     candidates:
      pjc.a(java.lang.String, java.lang.String, long, java.lang.String):void
      pjc.a(java.lang.String, byte[], long, java.lang.String):void
      pil.a(java.lang.String, java.lang.String, long, java.lang.String):void
      pjc.a(java.lang.String, java.lang.Object, long, java.lang.String):void */
    /* renamed from: a */
    public final void mo23230a(String str, byte[] bArr, String str2) {
        String str3;
        pjc pjc = this.f39257a;
        if (TextUtils.isEmpty(str2)) {
            str3 = this.f39257a.mo23261o();
        } else {
            str3 = str2;
        }
        pjc.mo23241a(str, (Object) bArr, 0L, str3);
    }
}
