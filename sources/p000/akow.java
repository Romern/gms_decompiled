package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.notifications.Identifier;
import com.google.android.gms.notifications.ReadStateUpdate;

/* renamed from: akow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akow extends akot {

    /* renamed from: d */
    private static final srn f72369d = srn.m36127a(sgj.GUNS);

    /* renamed from: a */
    final String f72370a;

    /* renamed from: b */
    final String f72371b;

    /* renamed from: c */
    final ReadStateUpdate f72372c;

    public akow(String str, String str2, ReadStateUpdate readStateUpdate, akou akou) {
        super(akou, "UpdateReadState");
        this.f72370a = str;
        this.f72371b = str2;
        this.f72372c = readStateUpdate;
    }

    /* renamed from: b */
    public final Status mo39614b(Context context) {
        try {
            aknz aknz = new aknz(context);
            String str = this.f72370a;
            String str2 = this.f72371b;
            ReadStateUpdate readStateUpdate = this.f72372c;
            bxvd da = blfn.f126393e.mo74144da();
            Identifier identifier = readStateUpdate.f81227c;
            bxvd da2 = blco.f125949g.mo74144da();
            long j = identifier.f81222d;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            blco blco = (blco) da2.f164949b;
            int i = blco.f125951a | 4;
            blco.f125951a = i;
            blco.f125954d = j;
            String str3 = identifier.f81220b;
            if (str3 != null) {
                str3.getClass();
                i |= 1;
                blco.f125951a = i;
                blco.f125952b = str3;
            }
            String str4 = identifier.f81221c;
            if (str4 != null) {
                str4.getClass();
                i |= 2;
                blco.f125951a = i;
                blco.f125953c = str4;
            }
            String str5 = identifier.f81223e;
            if (str5 != null) {
                str5.getClass();
                i |= 8;
                blco.f125951a = i;
                blco.f125955e = str5;
            }
            String str6 = identifier.f81224f;
            if (str6 != null) {
                str6.getClass();
                blco.f125951a = i | 16;
                blco.f125956f = str6;
            }
            blco blco2 = (blco) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blfn blfn = (blfn) da.f164949b;
            blco2.getClass();
            blfn.f126396b = blco2;
            int i2 = 1;
            blfn.f126395a |= 1;
            int a = blch.m107015a(readStateUpdate.f81226b);
            if (a != 0) {
                i2 = a;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blfn blfn2 = (blfn) da.f164949b;
            blfn2.f126397c = i2 - 1;
            blfn2.f126395a |= 4;
            blfo blfo = (blfo) blfp.f126399b.mo74144da();
            blfo.mo66477a(da);
            aknz.mo39595a(context, str, str2, (blfp) blfo.mo74062i());
            return Status.f30107a;
        } catch (VolleyError | gid e) {
            bnsl bnsl = (bnsl) f72369d.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to update the notification(s) read state.");
            return Status.f30109c;
        }
    }
}
