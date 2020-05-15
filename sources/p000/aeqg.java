package p000;

import android.accounts.Account;
import com.google.android.gms.location.reporting.UploadRequest;

/* renamed from: aeqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeqg {

    /* renamed from: a */
    public final Account f63623a;

    /* renamed from: b */
    public final String f63624b;

    /* renamed from: c */
    public final long f63625c;

    /* renamed from: d */
    public long f63626d = Long.MAX_VALUE;

    /* renamed from: e */
    public long f63627e = Long.MAX_VALUE;

    /* renamed from: f */
    public String f63628f;

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
    public aeqg(Account account, String str, long j) {
        sdo.m34966a(account, "account");
        this.f63623a = account;
        sdo.m34966a((Object) str, (Object) "reason");
        this.f63624b = str;
        this.f63625c = j;
    }

    /* renamed from: a */
    public final UploadRequest mo34454a() {
        return new UploadRequest(this);
    }
}
