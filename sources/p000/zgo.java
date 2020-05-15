package p000;

import com.google.android.gms.location.DetectedActivity;

/* renamed from: zgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zgo {

    /* renamed from: a */
    private static final srn f55030a = zvt.m46581a();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, com.google.android.gms.location.DetectedActivity, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    public static int m45397a(DetectedActivity detectedActivity) {
        int a = detectedActivity.mo43513a();
        switch (a) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
                return -1;
            case 12:
                return 77;
            case 15:
                return 72;
            default:
                bnsl bnsl = (bnsl) f55030a.mo68388c();
                bnsl.mo68432a("zgo", "a", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68422a("Unknown detected activity %s (%d)", (Object) detectedActivity, a);
                return -1;
        }
    }
}
