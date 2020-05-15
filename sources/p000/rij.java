package p000;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rij {
    /* renamed from: a */
    public static ClientActionDataEntity m33634a(Audience audience) {
        return m33635a(audience != null ? audience.f30287b : null, false, false);
    }

    /* renamed from: a */
    public static ClientActionDataEntity m33635a(List list, boolean z, boolean z2) {
        aogf aogf;
        String str;
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add("6");
        }
        if (z) {
            arrayList.add("5");
            aofy aofy = new aofy();
            aofv aofv = new aofv();
            aofv.mo42689b(arrayList);
            aofy.mo42693a(aofv.mo42687a());
            return (ClientActionDataEntity) aofy.mo42692a();
        } else if (list == null) {
            return null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AudienceMember audienceMember = (AudienceMember) list.get(i);
                if (audienceMember != null) {
                    if (audienceMember.mo17845a()) {
                        String str2 = audienceMember.f30294d;
                        aogb aogb = new aogb();
                        aogb.mo42699a(str2);
                        arrayList2.add(aogb.mo42698a());
                    } else if (audienceMember.mo17847c()) {
                        String str3 = audienceMember.f30295e;
                        String e = ancm.m64016e(str3);
                        String g = ancm.m64018g(str3);
                        if (!TextUtils.isEmpty(e) || !TextUtils.isEmpty(g)) {
                            aoge aoge = new aoge();
                            if (!TextUtils.isEmpty(e)) {
                                aoge.mo42704b(e);
                            }
                            if (!TextUtils.isEmpty(g)) {
                                aoge.mo42703a(g);
                            }
                            aogf = aoge.mo42702a();
                        } else {
                            if (Log.isLoggable("AclDetails", 5)) {
                                String valueOf = String.valueOf(str3);
                                Log.w("AclDetails", valueOf.length() == 0 ? new String("unhandled people qualified ID: ") : "unhandled people qualified ID: ".concat(valueOf));
                            }
                            aogf = null;
                        }
                        if (aogf != null) {
                            arrayList3.add(aogf);
                        }
                    } else if (audienceMember.mo17846b()) {
                        int i2 = audienceMember.f30293c;
                        if (i2 == 1) {
                            str = "1";
                        } else if (i2 == 2) {
                            str = "2";
                        } else if (i2 == 3) {
                            str = "4";
                        } else if (i2 != 4) {
                            if (Log.isLoggable("AclDetails", 5)) {
                                int i3 = audienceMember.f30293c;
                                StringBuilder sb = new StringBuilder(49);
                                sb.append("unhandled PeopleConstants.CircleType: ");
                                sb.append(i3);
                                Log.w("AclDetails", sb.toString());
                            }
                            str = "0";
                        } else {
                            str = "3";
                        }
                        arrayList.add(str);
                    } else if (Log.isLoggable("AclDetails", 5)) {
                        int i4 = audienceMember.f30292b;
                        StringBuilder sb2 = new StringBuilder(42);
                        sb2.append("unhandled AudienceMember type: ");
                        sb2.append(i4);
                        Log.w("AclDetails", sb2.toString());
                    }
                }
            }
            if (!arrayList2.isEmpty() || !arrayList3.isEmpty() || !arrayList.isEmpty()) {
                aofv aofv2 = new aofv();
                if (!arrayList2.isEmpty()) {
                    aofv2.mo42688a(arrayList2);
                }
                if (!arrayList3.isEmpty()) {
                    aofv2.f78287a = arrayList3;
                    aofv2.f78288b.add(4);
                }
                if (!arrayList.isEmpty()) {
                    aofv2.mo42689b(arrayList);
                }
                aofy aofy2 = new aofy();
                aofy2.mo42693a(aofv2.mo42687a());
                return (ClientActionDataEntity) aofy2.mo42692a();
            }
            if (Log.isLoggable("AclDetails", 5)) {
                String valueOf2 = String.valueOf(list);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
                sb3.append("no AclDetails from audience: ");
                sb3.append(valueOf2);
                Log.w("AclDetails", sb3.toString());
            }
            return null;
        }
    }
}
