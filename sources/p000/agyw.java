package p000;

import android.content.SharedPreferences;

/* renamed from: agyw */
public final /* synthetic */ class agyw implements Runnable {

    /* renamed from: a */
    private final agza f66884a;

    /* renamed from: b */
    private final String f66885b;

    /* renamed from: c */
    private final boolean f66886c;

    public agyw(agza agza, String str, boolean z) {
        this.f66884a = agza;
        this.f66885b = str;
        this.f66886c = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, java.lang.String, boolean]
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
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void */
    public final void run() {
        agza agza = this.f66884a;
        String str = this.f66885b;
        boolean z = this.f66886c;
        SharedPreferences.Editor edit = agza.f66897b.edit();
        edit.putBoolean(str, z);
        if (!edit.commit()) {
            ((bnsl) agza.f66895c.mo68388c()).mo68431a("Saving notification failed for %s value %b", (Object) str, z);
        }
    }
}
