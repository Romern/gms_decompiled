package p000;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import java.util.HashSet;
import java.util.Map;

/* renamed from: azqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azqn {

    /* renamed from: a */
    public aztx f99902a;

    /* renamed from: b */
    public final Context f99903b;

    /* renamed from: c */
    public Map f99904c = bnmt.m109809c();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    public azqn(Context context, aztx aztx) {
        this.f99903b = context.getApplicationContext();
        this.f99902a = aztx;
        HashSet<azrk> hashSet = new HashSet();
        aztu aztu = new aztu(this.f99903b, this.f99902a);
        hashSet.add(new azto(this.f99903b, aztu));
        hashSet.add(new azun(this.f99903b));
        hashSet.add(new azvv(this.f99903b, aztu));
        if (cfeo.m138890u()) {
            Context context2 = this.f99903b;
            hashSet.add(new azwa(context2, (bcve) azbj.m85193a(context2).mo54565e().mo66814b()));
        }
        if (cfgs.m139411q()) {
            bmxv i = azbj.m85193a(this.f99903b).mo54569i();
            if (i.mo66813a()) {
                hashSet.add(new azwn(this.f99903b, (bbpv) i.mo66814b(), aztu));
            }
        }
        soc soc = new soc(8, 9);
        azqm azqm = new azqm(this);
        for (azrk azrk : hashSet) {
            String concat = String.valueOf(azrk.mo55250a()).concat("Async");
            azql azql = new azql(this.f99903b, concat, azqm, azrk, soc);
            this.f99904c.put(concat, azql);
            azql.mo55224a();
        }
        aztx aztx2 = this.f99902a;
        String[] strArr = (String[]) this.f99904c.keySet().toArray(new String[hashSet.size()]);
        try {
            ((azrl) aztx2).f99945b.mo54854a(strArr);
        } catch (RemoteException e) {
            azoj.m85931a("LWAIDLCallback", e, "Unable to add JS Bridge in UI process listener", new Object[0]);
            azrl azrl = (azrl) aztx2;
            azed azed = azrl.f99946c;
            azph.m85998a(azed.f99146a).mo55125a(1926);
            azec azec = (azec) azed.f99147b;
            azph.m85998a(azec.f99145a.f99146a).mo55125a(1923);
            Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.AIDL_FALLBACK");
            intent.setPackage(azec.f99145a.f99146a.getPackageName());
            intent.putExtra("add_js_bridges", strArr);
            intent.putExtra("reconnect_aidl_connection", true);
            azec.f99145a.f99146a.sendBroadcast(intent, "com.google.android.gms.matchstick.permission.BROADCAST_LIGHTER_WEB_INFO");
            azph.m85998a(azrl.f99944a).mo55126a(1912, 65);
        }
    }
}
