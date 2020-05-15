package p000;

import android.content.ComponentName;
import android.os.SystemClock;
import com.google.android.gms.ipa.appsindexer.IpaPackageBroadcastIntentOperation;
import java.util.HashSet;

/* renamed from: adni */
public final /* synthetic */ class adni implements Runnable {

    /* renamed from: a */
    private final IpaPackageBroadcastIntentOperation f62213a;

    /* renamed from: b */
    private final String f62214b;

    public adni(IpaPackageBroadcastIntentOperation ipaPackageBroadcastIntentOperation, String str) {
        this.f62213a = ipaPackageBroadcastIntentOperation;
        this.f62214b = str;
    }

    public final void run() {
        IpaPackageBroadcastIntentOperation ipaPackageBroadcastIntentOperation = this.f62213a;
        String str = this.f62214b;
        adnd a = adnd.m50837a(ipaPackageBroadcastIntentOperation);
        if (a != null) {
            bxvd da = boly.f133593k.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((boly) da.f164949b).f133595a = bolx.m111324a(4);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (ComponentName componentName : a.f62203c.mo33674a()) {
                if (str.equals(componentName.getPackageName())) {
                    hashSet2.add(adne.m50845a(componentName));
                } else {
                    hashSet.add(componentName);
                }
            }
            int size = hashSet2.size();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((boly) da.f164949b).f133598d = size;
            aucb a2 = a.f62202b.mo32870a((String[]) hashSet2.toArray(new String[hashSet2.size()]));
            a2.mo50372a(adnd.m50838a(elapsedRealtime, (boly) da.mo74062i(), 32));
            a2.mo50373a(adnd.m50839a(elapsedRealtime, (boly) da.mo74062i()));
            a.f62203c.mo33675a(hashSet);
        }
    }
}
