package p000;

import android.util.Pair;
import android.view.View;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: tbq */
public final /* synthetic */ class tbq implements View.OnClickListener {

    /* renamed from: a */
    private final ConstellationDebugChimeraActivity f45618a;

    public tbq(ConstellationDebugChimeraActivity constellationDebugChimeraActivity) {
        this.f45618a = constellationDebugChimeraActivity;
    }

    public void onClick(View view) {
        for (Map.Entry entry : tdg.m36749a().mo26395a(this.f45618a.mo17987a(UUID.randomUUID().toString())).entrySet()) {
            ConstellationDebugChimeraActivity.f30575b.mo25412b("%d smsEvents, %d callEvents", Integer.valueOf(((List) ((Pair) entry.getValue()).first).size()), Integer.valueOf(((List) ((Pair) entry.getValue()).second).size()));
            ConstellationDebugChimeraActivity.f30575b.mo25412b("Events for subId: %d", entry.getKey());
            Iterator it = ((List) ((Pair) entry.getValue()).first).iterator();
            while (it.hasNext()) {
                ConstellationDebugChimeraActivity.f30575b.mo25412b("SMSEvent: %s", (cbpa) it.next());
            }
            Iterator it2 = ((List) ((Pair) entry.getValue()).second).iterator();
            while (it2.hasNext()) {
                ConstellationDebugChimeraActivity.f30575b.mo25412b("CallEvent: %s", (cbov) it2.next());
            }
        }
    }
}
