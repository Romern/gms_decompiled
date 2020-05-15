package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* renamed from: aaoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaoi {

    /* renamed from: a */
    public final aeat f28690a;

    /* renamed from: b */
    private final Context f28691b;

    public aaoi(Context context, aeat aeat) {
        this.f28691b = context;
        this.f28690a = aeat;
    }

    /* renamed from: a */
    public final void mo17177a(Bundle bundle) {
        String string = bundle.getString("google.c.cm.cat");
        String string2 = bundle.getString("google.c.cm.from");
        if (string == null) {
            Log.e("GCM", "device-time message is missing a required field: msg discarded");
            return;
        }
        Intent intent = new Intent("com.google.android.c2dm.intent.RECEIVE");
        intent.setPackage(string);
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.cm.")) {
                bundle2.remove(str);
            }
        }
        intent.putExtras(bundle2);
        if (string2 != null) {
            intent.putExtra("from", string2);
        }
        Log.i("GCM", string.length() == 0 ? new String("device-time message is being broadcast to ") : "device-time message is being broadcast to ".concat(string));
        this.f28691b.sendOrderedBroadcast(intent, null);
    }
}
