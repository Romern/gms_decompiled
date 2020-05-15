package p000;

import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: ayfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayfr extends aygz {

    /* renamed from: a */
    public final axxi f97494a;

    public ayfr(String str, Intent intent, axxi axxi) {
        super(str, intent);
        this.f97494a = axxi;
    }

    /* renamed from: a */
    public final String mo53988a() {
        return "DataWearableServiceEvent";
    }

    /* renamed from: a */
    public final void mo53989a(aygk aygk, axrv axrv) {
        ArrayList arrayList;
        DataHolder dataHolder;
        if (aygk == null) {
            axxi axxi = this.f97494a;
            if (axxi.f96648c) {
                axxf axxf = axxi.f96647b;
                rtu a = DataHolder.m22537a(ayft.f97497a);
                HashMap hashMap = new HashMap();
                hashMap.put("event_type", 2);
                hashMap.put("path", axxf.f96641c.toString());
                if (Log.isLoggable("EventHolderBuilder", 3)) {
                    String valueOf = String.valueOf(hashMap);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("buildForDeletedDataItem: ");
                    sb.append(valueOf);
                    Log.d("EventHolderBuilder", sb.toString());
                }
                a.mo25161a(hashMap);
                dataHolder = a.mo25163a(0);
                if (Log.isLoggable("EventHolderBuilder", 3)) {
                    String valueOf2 = String.valueOf(dataHolder);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 15);
                    sb2.append("opened holder: ");
                    sb2.append(valueOf2);
                    Log.d("EventHolderBuilder", sb2.toString());
                }
            } else {
                axxf axxf2 = axxi.f96647b;
                rtu a2 = DataHolder.m22537a(ayft.f97497a);
                ayft.m83940a(a2, axxf2);
                dataHolder = a2.mo25163a(0);
                if (Log.isLoggable("EventHolderBuilder", 3)) {
                    String valueOf3 = String.valueOf(dataHolder);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 15);
                    sb3.append("opened holder: ");
                    sb3.append(valueOf3);
                    Log.d("EventHolderBuilder", sb3.toString());
                }
            }
            try {
                axrv.mo53366a(dataHolder);
            } finally {
                ayji.m84106a(dataHolder, axrv);
            }
        } else {
            synchronized (aygk.f97534d) {
                arrayList = new ArrayList();
                Iterator it = aygk.f97534d.iterator();
                while (it.hasNext()) {
                    aygz aygz = (aygz) it.next();
                    if (aygz instanceof ayfr) {
                        arrayList.add((ayfr) aygz);
                        it.remove();
                    }
                }
            }
            rtu a3 = DataHolder.m22537a(ayft.f97497a);
            int size = arrayList.size();
            axxi axxi2 = null;
            for (int i = 0; i < size; i++) {
                ayfr ayfr = (ayfr) arrayList.get(i);
                axxi axxi3 = ayfr.f97494a;
                if (axxi3.f96648c) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("event_type", 2);
                    hashMap2.put("path", ayfr.f97494a.f96647b.f96641c.toString());
                    if (Log.isLoggable("EventHolderBuilder", 3)) {
                        String valueOf4 = String.valueOf(hashMap2);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 25);
                        sb4.append("buildForDeletedDataItem: ");
                        sb4.append(valueOf4);
                        Log.d("EventHolderBuilder", sb4.toString());
                    }
                    a3.mo25161a(hashMap2);
                } else {
                    ayft.m83940a(a3, axxi3.f96647b);
                }
                if (axxi2 != null && axxi2.equals(ayfr.f97494a)) {
                    String valueOf5 = String.valueOf(axxi2);
                    String valueOf6 = String.valueOf(ayfr.f97494a);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 99 + String.valueOf(valueOf6).length());
                    sb5.append("it is illegal to have two consecutive instances of the same dataitem added to the DataHolder: ");
                    sb5.append(valueOf5);
                    sb5.append(" and ");
                    sb5.append(valueOf6);
                    throw new IllegalStateException(sb5.toString());
                }
                axxi2 = ayfr.f97494a;
            }
            DataHolder a4 = a3.mo25163a(0);
            if (Log.isLoggable("EventHolderBuilder", 3)) {
                String valueOf7 = String.valueOf(a4);
                StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf7).length() + 15);
                sb6.append("opened holder: ");
                sb6.append(valueOf7);
                Log.d("EventHolderBuilder", sb6.toString());
            }
            try {
                axrv.mo53366a(a4);
                aygk.mo54010a(this);
                ayji.m84106a(a4, axrv);
            } catch (RemoteException e) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    aygk.mo54010a((aygz) arrayList.get((size2 - i2) - 1));
                }
                throw e;
            } catch (Throwable th) {
                ayji.m84106a(a4, axrv);
                throw th;
            }
        }
    }
}
