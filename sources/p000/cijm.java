package p000;

import com.felicanetworks.mfc.Block;
import com.felicanetworks.mfc.BlockList;
import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.FelicaException;

/* renamed from: cijm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cijm implements brgm {

    /* renamed from: a */
    final /* synthetic */ brep f190438a;

    public cijm(brep brep) {
        this.f190438a = brep;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69520a(Felica felica) {
        int i;
        boolean z;
        Integer num = cijs.f190456a;
        try {
            this.f190438a.mo49930a();
            cijy cijy = new cijy(felica);
            BlockList blockList = new BlockList();
            blockList.add(0, new Block(13771, 4));
            byte[] a = cijy.m150498a(cijy.f190492b.read(blockList));
            String a2 = cijy.m150496a(a);
            String a3 = cijy.m150496a(cijy.m150497a(a, 8, 2));
            int parseInt = Integer.parseInt(cijy.m150496a(cijy.m150497a(a, 13, 1))) + 2000;
            int parseInt2 = Integer.parseInt(cijy.m150496a(cijy.m150497a(a, 14, 1)));
            String a4 = cijy.m150496a(cijy.m150497a(a, 0, 1));
            if (cijy.f190489e.containsKey(a4)) {
                i = ((Integer) cijy.f190489e.get(a4)).intValue();
            } else {
                i = 1;
            }
            if (cijy.f190490f.containsKey(a4)) {
                z = ((Boolean) cijy.f190490f.get(a4)).booleanValue();
            } else {
                z = false;
            }
            cijv cijv = new cijv(a3, parseInt, parseInt2, i, z, a2);
            cijv.f190473g = a4.equals("02");
            cijv.f190469c = cijy.m150496a(felica.getIDm());
            String a5 = cijy.m150496a(felica.getICCode());
            String substring = a5.substring(0, 2);
            String valueOf = String.valueOf(a5.substring(2, a5.length()));
            String valueOf2 = String.valueOf(substring);
            cijv.f190470d = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            cijv.f190471e = cijy.m150496a(felica.getContainerIssueInformation());
            this.f190438a.mo49930a();
            return cijv;
        } catch (FelicaException e) {
            if (e.getType() == 11 || e.getType() == 12) {
                int type = e.getType();
                StringBuilder sb = new StringBuilder(52);
                sb.append("readDefaultCardData chip Empty (type = ");
                sb.append(type);
                sb.append(").");
                sb.toString();
                return null;
            }
            int id = e.getID();
            int type2 = e.getType();
            StringBuilder sb2 = new StringBuilder(61);
            sb2.append("FelicaException occurred. (id:");
            sb2.append(id);
            sb2.append(", type:");
            sb2.append(type2);
            sb2.append(").");
            sb2.toString();
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo69521a(bret bret) {
        Integer num = cijs.f190456a;
        new Object[1][0] = bret.name();
        this.f190438a.mo49931a(new bres(bret));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69522a(Object obj) {
        String str;
        cijt cijt = (cijt) obj;
        Integer num = cijs.f190456a;
        cijv cijv = (cijv) cijt;
        if (cijt == null || !cijv.f190472f.equals("00000000000000000000000000000000")) {
            if (cijt != null) {
                str = cijt.toString();
            } else {
                str = null;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("readDefaultCardData onSuccess (data = ");
            sb.append(str);
            sb.append(").");
            sb.toString();
            this.f190438a.mo49932a(cijt);
            return;
        }
        this.f190438a.mo49931a(new bres(cijw.QUICPAY_UNFORMATTED_ERROR));
    }
}
