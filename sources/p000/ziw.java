package p000;

import android.os.RemoteException;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ziw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ziw implements zgg {

    /* renamed from: a */
    public final yqf f55169a;

    /* renamed from: b */
    private final zgg f55170b;

    public ziw(yqf yqf, zgg zgg) {
        this.f55169a = yqf;
        this.f55170b = zgg;
    }

    /* renamed from: a */
    public final void mo30949a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(this.f55169a.mo30662a((cadn) it.next()));
        }
        srn srn = zix.f55171a;
        try {
            this.f55170b.mo30949a(arrayList);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) zix.f55171a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ziw", "a", (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Couldn't push transformed event back to listener");
        }
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = bzzn.m126367c(this.f55169a.mo30661a());
        caah caah = this.f55169a.mo30664c().f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        objArr[1] = bzzn.m126367c(caah);
        objArr[2] = this.f55170b;
        return String.format("TransformingListener{%s->%s, clientListener=%s}", objArr);
    }
}
