package p000;

import android.util.Log;
import com.google.android.places.p095ui.aliaseditor.AliasEditorChimeraActivity;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bijf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bijf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map f120715a;

    /* renamed from: b */
    final /* synthetic */ AliasEditorChimeraActivity f120716b;

    public bijf(AliasEditorChimeraActivity aliasEditorChimeraActivity, Map map) {
        this.f120716b = aliasEditorChimeraActivity;
        this.f120715a = map;
    }

    public final void run() {
        aelh aelh;
        this.f120716b.mo71309k();
        Iterator it = this.f120715a.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                aelh = null;
                break;
            }
            String str = (String) it.next();
            if (this.f120716b.f151375c.equals(str)) {
                aelh = (aelh) this.f120715a.get(str);
                break;
            }
        }
        if (aelh != null) {
            AliasEditorChimeraActivity aliasEditorChimeraActivity = this.f120716b;
            aliasEditorChimeraActivity.f151380h = aelh;
            aliasEditorChimeraActivity.mo71307b(aliasEditorChimeraActivity.f151380h);
            AliasEditorChimeraActivity aliasEditorChimeraActivity2 = this.f120716b;
            if (aliasEditorChimeraActivity2.f151381i != null) {
                aliasEditorChimeraActivity2.f151381i = null;
                this.f120716b.mo71310l();
                return;
            }
            return;
        }
        if (Log.isLoggable("Places", 5)) {
            String valueOf = String.valueOf(this.f120716b.f151375c);
            Log.w("Places", valueOf.length() == 0 ? new String("Failed to find place for alias ") : "Failed to find place for alias ".concat(valueOf));
        }
        AliasEditorChimeraActivity aliasEditorChimeraActivity3 = this.f120716b;
        aelh aelh2 = aliasEditorChimeraActivity3.f151381i;
        if (aelh2 != null) {
            aliasEditorChimeraActivity3.mo64641a(aelh2.mo8007a(), this.f120716b.f151381i.mo8025r().toString());
        }
    }
}
