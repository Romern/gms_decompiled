package p000;

import android.os.Process;
import com.google.android.gms.carsetup.restart.RestartOperation;

/* renamed from: oyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oyl extends oun {
    /* renamed from: a */
    public final void mo22656a() {
        bnsi d = RestartOperation.f29669a.mo68390d();
        d.mo68432a("oyl", "a", 86, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Killing self");
        Process.killProcess(Process.myPid());
        System.exit(0);
    }
}
