package p000;

import com.google.android.gms.auth.proximity.RemoteDevice;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jji implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f22617a;

    /* renamed from: b */
    final /* synthetic */ jju f22618b;

    public jji(jju jju, List list) {
        this.f22618b = jju;
        this.f22617a = list;
    }

    public final void run() {
        jju jju = this.f22618b;
        if (jju.f22652o == null) {
            jju.f22652o = new jjs(jju, jju.f22650m);
        }
        if (this.f22617a.isEmpty()) {
            jnc jnc = this.f22618b.f22648k;
            synchronized (jnc.f22859e) {
                jnc.f22862h = true;
                jnc.f22860f.clear();
            }
        }
        jio jio = this.f22618b.f22640c;
        List list = this.f22617a;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RemoteDevice remoteDevice = (RemoteDevice) list.get(i);
            if (!jio.f22560b.contains(remoteDevice)) {
                arrayList.add(remoteDevice);
            }
        }
        if (!arrayList.isEmpty()) {
            StringBuilder sb = new StringBuilder("Adding Device IDs: [");
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                RemoteDevice remoteDevice2 = (RemoteDevice) arrayList.get(i2);
                jio.f22560b.add(remoteDevice2);
                sb.append(remoteDevice2.mo7784a());
                sb.append(',');
            }
            sb.replace(sb.length() - 1, sb.length(), "]");
            jio.f22559a.mo25412b(sb.toString(), new Object[0]);
        }
        ArrayList arrayList2 = new ArrayList();
        List list2 = jio.f22560b;
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            RemoteDevice remoteDevice3 = (RemoteDevice) list2.get(i3);
            if (!list.contains(remoteDevice3)) {
                arrayList2.add(remoteDevice3);
            }
        }
        if (!arrayList2.isEmpty()) {
            StringBuilder sb2 = new StringBuilder("Removing Device IDs: [");
            int size4 = arrayList2.size();
            for (int i4 = 0; i4 < size4; i4++) {
                RemoteDevice remoteDevice4 = (RemoteDevice) arrayList2.get(i4);
                jio.f22560b.remove(remoteDevice4);
                sb2.append(remoteDevice4.mo7784a());
                sb2.append(',');
            }
            sb2.replace(sb2.length() - 1, sb2.length(), "]");
            jio.f22559a.mo25412b(sb2.toString(), new Object[0]);
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            this.f22618b.mo13802c();
        }
    }
}
