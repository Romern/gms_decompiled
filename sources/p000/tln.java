package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;

/* renamed from: tln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tln extends drx {

    /* renamed from: c */
    private final Context f46241c;

    /* renamed from: d */
    private final Intent f46242d;

    public tln(Context context, Intent intent) {
        super("GcmBroadcastHandler");
        this.f46241c = context;
        this.f46242d = intent;
    }

    /* renamed from: a */
    static bxqs m37163a(Intent intent) {
        String stringExtra = intent.getStringExtra("fp-cm-gcm-msg");
        if (stringExtra == null || stringExtra.isEmpty()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("tln", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[GcmBroadcastHandler] Empty or Null payload while decoding a context manager gcm message.");
            return null;
        }
        try {
            bxqs bxqs = (bxqs) bxvk.m124016a(bxqs.f164423c, Base64.decode(stringExtra, 0), bxus.m123744c());
            new Object[1][0] = bxqs;
            return bxqs;
        } catch (bxwf e) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
            bnsl2.mo68432a("tln", "a", 135, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("[GcmBroadcastHandler] InvalidProtocolBufferException while parsing the gcm message");
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ecv.a(doh, boolean):ecu
     arg types: [doh, int]
     candidates:
      ecv.a(doh, ecu):void
      ecv.a(doh, tjq):void
      eev.a(doh, tjq):void
      ecv.a(doh, boolean):ecu */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        bxqs bxqs;
        new Object[1][0] = this.f46242d;
        if (dss.m9250a(2) && this.f46242d.getExtras() != null) {
            Bundle extras = this.f46242d.getExtras();
            StringBuilder sb = new StringBuilder();
            for (String str : extras.keySet()) {
                sb.append("[");
                sb.append(str);
                sb.append(", ");
                sb.append(extras.getCharSequence(str));
                sb.append("], ");
            }
            Object[] objArr = {this.f46242d, sb.toString()};
        }
        if ("com.google.android.gms.gcm.REGISTERED".equals(this.f46242d.getAction())) {
            ecv v = dwq.m9678v();
            if (!TextUtils.isEmpty(v.mo9975a())) {
                for (doh doh : dwq.m9681y().mo9331a()) {
                    v.mo9974a(doh, true);
                }
                return;
            }
            return;
        }
        Context context = this.f46241c;
        Intent intent = this.f46242d;
        String a = aakz.m21424a(context).mo16960a(intent);
        if ("send_error".equals(a)) {
            new Object[1][0] = intent.getExtras();
            return;
        }
        if ("deleted_messages".equals(a)) {
            new Object[1][0] = intent.getExtras();
        } else if (!"gcm".equals(a)) {
            return;
        }
        efo efo = null;
        if (this.f46242d.hasExtra("sf-cm-gcm-msg")) {
            efh z = dwq.m9682z();
            String stringExtra = this.f46242d.getStringExtra("sf-cm-gcm-msg");
            doh doh2 = TextUtils.isEmpty(stringExtra) ? doh.f13688a : new doh(stringExtra);
            Object[] objArr2 = {doh2, 0L};
            if (z.f14823a != null) {
                efo = new efo(doh2);
            }
            z.mo10070a(efo, 0, 0, "ReadServerFenceUpdatesOperation", doh2.f13690b);
        } else if (this.f46242d.hasExtra("fp-cm-gcm-msg")) {
            String stringExtra2 = this.f46242d.getStringExtra("fp-cm-gcm-msg");
            if (stringExtra2 == null || stringExtra2.isEmpty()) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("tln", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[GcmBroadcastHandler] Empty or Null payload while decoding a context manager gcm message.");
                bxqs = null;
            } else {
                try {
                    bxqs = (bxqs) bxvk.m124016a(bxqs.f164423c, Base64.decode(stringExtra2, 0), bxus.m123744c());
                    new Object[1][0] = bxqs;
                } catch (bxwf e) {
                    bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                    bnsl2.mo68432a("tln", "a", 135, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("[GcmBroadcastHandler] InvalidProtocolBufferException while parsing the gcm message");
                    bxqs = null;
                }
            }
            if (bxqs == null) {
                bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                bnsl3.mo68432a("tln", "a", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("[GcmBroadcastHandler] Could not decode gcm message.");
                return;
            }
            dwq.m9673q().mo10051a(tjq.m37092a(null, 10, bxqs));
            dwq.m9682z().mo10068a();
        }
    }
}
