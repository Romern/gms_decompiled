package p000;

import android.os.Binder;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceTriggerInfoImpl;

/* renamed from: drz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class drz implements tku {

    /* renamed from: a */
    final IBinder f13915a = new Binder();

    /* renamed from: b */
    final /* synthetic */ dsc f13916b;

    public drz(dsc dsc) {
        this.f13916b = dsc;
    }

    /* renamed from: a */
    public final void mo9519a(FenceStateImpl fenceStateImpl) {
        String str;
        if (fenceStateImpl == null || !TextUtils.equals(this.f13916b.f13919c, fenceStateImpl.f30655c)) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("drz", "a", 58, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            String str2 = this.f13916b.f13919c;
            if (fenceStateImpl != null) {
                str = fenceStateImpl.f30655c;
            } else {
                str = "none";
            }
            bnsl.mo68424a("[EvaluateFenceOperation] No fenceState or fence key does not match. expected=%s, got=%s", str2, str);
        } else if (fenceStateImpl.f30653a == 0) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
            bnsl2.mo68432a("drz", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("[EvaluateFenceOperation] current fenceState is UNKNOWN");
        } else {
            this.f13916b.mo9527a(0, fenceStateImpl);
        }
    }

    /* renamed from: a */
    public final void mo9520a(FenceTriggerInfoImpl fenceTriggerInfoImpl) {
    }

    public final IBinder asBinder() {
        return this.f13915a;
    }
}
