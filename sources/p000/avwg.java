package p000;

import com.google.android.gms.userlocation.EstimationOptions;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;

/* renamed from: avwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avwg {

    /* renamed from: a */
    public int f94016a = 2;

    /* renamed from: b */
    public boolean f94017b = true;

    /* renamed from: c */
    public boolean f94018c = true;

    /* renamed from: d */
    private String f94019d = null;

    /* renamed from: e */
    private int f94020e = 0;

    /* renamed from: a */
    public final SemanticLocationEventRequest mo51667a() {
        if (this.f94020e != 0) {
            int i = this.f94016a;
            if (i != 2 && i != 1) {
                StringBuilder sb = new StringBuilder(29);
                sb.append("Invalid priority: 0");
                throw new IllegalArgumentException(sb.toString());
            } else if (!stm.m36302d(this.f94019d)) {
                return new SemanticLocationEventRequest(this.f94019d, this.f94016a, new EstimationOptions(this.f94017b, this.f94018c), this.f94020e);
            } else {
                String valueOf = String.valueOf(this.f94019d);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid request ID: ") : "Invalid request ID: ".concat(valueOf));
            }
        } else {
            throw new IllegalArgumentException("At least one event type must be added");
        }
    }

    /* renamed from: a */
    public final void mo51668a(int i) {
        this.f94020e = i | this.f94020e;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final void mo51669a(String str) {
        boolean z;
        sdo.m34969a(str, (Object) "Request ID cannot be empty.");
        if (str.length() <= 30) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Request ID cannot exceed length of 30");
        this.f94019d = str;
    }
}
