package p000;

import android.content.Intent;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: rqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rqd {

    /* renamed from: a */
    public final AudienceMember f43515a;

    /* renamed from: b */
    public final int f43516b;

    /* renamed from: c */
    public final int f43517c;

    /* renamed from: d */
    private final String f43518d;

    public rqd(int i, AudienceMember audienceMember, int i2, String str) {
        this.f43516b = i;
        this.f43515a = audienceMember;
        this.f43517c = i2;
        this.f43518d = str;
        m34259b();
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
    /* renamed from: b */
    private final void m34259b() {
        sdo.m34962a(this.f43516b, "Invalid create circle status code.");
        sdo.m34962a(this.f43517c, "Invalid add person status code.");
        if (this.f43516b == 1) {
            sdo.m34966a((Object) this.f43515a.f30294d, (Object) "Must provide a circle with circle id.");
            sdo.m34966a((Object) this.f43515a.f30296f, (Object) "Must provide a circle with display name.");
        }
        if (this.f43517c == 1) {
            sdo.m34966a((Object) this.f43518d, (Object) "Must provide qualified id.");
        }
    }

    /* renamed from: a */
    public final Intent mo25022a() {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.plus.audience.EXTRA_CREATE_CIRCLE_STATUS_CODE", this.f43516b);
        intent.putExtra("com.google.android.gms.plus.audience.EXTRA_CIRCLE", this.f43515a);
        intent.putExtra("com.google.android.gms.plus.audience.EXTRA_ADD_PERSON_STATUS_CODE", this.f43517c);
        intent.putExtra("com.google.android.gms.plus.audience.EXTRA_QUALIFIED_ID", this.f43518d);
        return intent;
    }

    public rqd(Intent intent) {
        this.f43516b = intent.getIntExtra("com.google.android.gms.plus.audience.EXTRA_CREATE_CIRCLE_STATUS_CODE", 0);
        this.f43515a = (AudienceMember) intent.getParcelableExtra("com.google.android.gms.plus.audience.EXTRA_CIRCLE");
        this.f43517c = intent.getIntExtra("com.google.android.gms.plus.audience.EXTRA_ADD_PERSON_STATUS_CODE", 0);
        this.f43518d = intent.getStringExtra("com.google.android.gms.plus.audience.EXTRA_QUALIFIED_ID");
        m34259b();
    }
}
