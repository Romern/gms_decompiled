package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.auth.authzen.DeviceData;
import com.google.android.gms.auth.authzen.Permit;
import com.google.android.gms.auth.authzen.PermitAccess;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ifw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ifw extends ift {

    /* renamed from: a */
    private final iie f20892a;

    public ifw(iie iie) {
        super("GetSyncedDevices");
        sdo.m34959a(iie);
        this.f20892a = iie;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f20892a.mo13040a(new iij(status, null).mo13041b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12978b(Context context) {
        Cursor query;
        ArrayList<Permit> arrayList;
        int i;
        int i2;
        iiz a = iix.m15497a(context);
        try {
            iiz.f21079b.mo25414c("Getting all permits...", new Object[0]);
            SQLiteDatabase a2 = a.f21080a.mo13052a();
            query = a2.query("permit", null, null, null, null, null, null);
            if (query.moveToFirst()) {
                arrayList = new ArrayList();
                while (!query.isAfterLast()) {
                    arrayList.add(iiz.m15498a(a2, query));
                    query.moveToNext();
                }
            } else {
                arrayList = new ArrayList();
            }
            query.close();
            int i3 = 0;
            for (Permit permit : arrayList) {
                i3 += permit.mo7544b().size();
            }
            if (i3 > ((Integer) igt.f20971u.mo58455c()).intValue()) {
                ArrayList<ifm> arrayList2 = new ArrayList(arrayList.size());
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                int i4 = 0;
                while (true) {
                    if (i4 < arrayList.size()) {
                        if (arrayList3.size() >= ((Integer) igt.f20971u.mo58455c()).intValue()) {
                            i2 = 0;
                            i = 0;
                            break;
                        }
                        Permit permit2 = (Permit) arrayList.get(i4);
                        if (!permit2.mo7544b().isEmpty()) {
                            ifm ifm = new ifm();
                            ifm.f20860a = permit2.f10382b;
                            ifm.f20861b = permit2.f10383c;
                            ifm.f20862c = permit2.f10384d;
                            ifm.f20863d = permit2.f10385e;
                            for (String str : permit2.mo7543a()) {
                                ifm.mo12969a(str);
                            }
                            arrayList2.add(ifm);
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.addAll(permit2.mo7544b());
                            arrayList3.add(arrayList4);
                        }
                        i4++;
                    } else {
                        i2 = 0;
                        i = 0;
                        break;
                    }
                }
                while (i2 < ((Integer) igt.f20971u.mo58455c()).intValue()) {
                    List list = (List) arrayList3.get(i);
                    if (!list.isEmpty()) {
                        ((ifm) arrayList2.get(i)).mo12968a((PermitAccess) list.remove(0));
                        i2++;
                    }
                    i = (i + 1) % arrayList3.size();
                }
                ArrayList arrayList5 = new ArrayList(arrayList.size());
                for (ifm ifm2 : arrayList2) {
                    arrayList5.add(ifm2.mo12967a());
                }
                arrayList = arrayList5;
            }
            this.f20892a.mo13040a(new iij(Status.f30107a, new DeviceData(1, arrayList)).mo13041b());
        } catch (iiy e) {
            mo6503a(Status.f30109c);
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
