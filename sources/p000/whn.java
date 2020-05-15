package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.family.invites.Contact;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: whn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class whn extends whz {

    /* renamed from: b */
    private final List f50663b;

    /* renamed from: c */
    private final String f50664c;

    /* renamed from: d */
    private final wgj f50665d;

    /* renamed from: e */
    private final String f50666e;

    /* renamed from: f */
    private final wgh f50667f;

    public whn(Context context, wgh wgh, wgj wgj, String str, List list, String str2) {
        super(context);
        this.f50663b = list;
        this.f50664c = str;
        this.f50666e = str2;
        this.f50665d = wgj;
        this.f50667f = wgh;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        ArrayList arrayList = new ArrayList();
        try {
            List<Contact> list = this.f50663b;
            String str = this.f50664c;
            String str2 = this.f50666e;
            bxvd da = brbx.f142330e.mo74144da();
            HashMap hashMap = new HashMap();
            for (Contact contact : list) {
                bxvd da2 = brbw.f142326c.mo74144da();
                bxvd da3 = brbu.f142318c.mo74144da();
                String str3 = contact.f31284c;
                if (str3 != null) {
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    brbu brbu = (brbu) da3.f164949b;
                    str3.getClass();
                    brbu.f142320a |= 2;
                    brbu.f142321b = str3;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                brbw brbw = (brbw) da2.f164949b;
                brbu brbu2 = (brbu) da3.mo74062i();
                brbu2.getClass();
                brbw.f142329b = brbu2;
                brbw.f142328a = 1 | brbw.f142328a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                brbx brbx = (brbx) da.f164949b;
                brbw brbw2 = (brbw) da2.mo74062i();
                brbw2.getClass();
                if (!brbx.f142334c.mo73666a()) {
                    brbx.f142334c = GeneratedMessageLite.m124021a(brbx.f142334c);
                }
                brbx.f142334c.add(brbw2);
                hashMap.put(((brbu) da3.f164949b).f142321b, contact);
            }
            brak a = wgy.m41937a(getContext(), this.f50665d, this.f50667f);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            brbx brbx2 = (brbx) da.f164949b;
            a.getClass();
            brbx2.f142333b = a;
            int i = brbx2.f142332a | 1;
            brbx2.f142332a = i;
            if (str != null) {
                str.getClass();
                brbx2.f142332a = i | 2;
                brbx2.f142335d = str;
            }
            String valueOf = String.valueOf(da);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Direct Add Request:");
            sb.append(valueOf);
            sb.toString();
            sbw sbw = wgn.f50624a;
            wih a2 = whc.m41943a();
            ClientContext a3 = whc.m41942a(str2);
            brbx brbx3 = (brbx) da.mo74062i();
            if (wih.f50730v == null) {
                wih.f50730v = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/DirectAddMembers", ciie.m150370a(brbx.f142330e), ciie.m150370a(brby.f142336d));
            }
            brby brby = (brby) a2.f50732a.mo25553a(wih.f50730v, a3, brbx3, (long) wih.f50710b, TimeUnit.MILLISECONDS);
            wgj wgj = this.f50665d;
            bral bral = brby.f142338a;
            if (bral == null) {
                bral = bral.f142158c;
            }
            wgy.m41938a(wgj, bral);
            String valueOf2 = String.valueOf(brby);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
            sb2.append("Direct Add Response:");
            sb2.append(valueOf2);
            sb2.toString();
            ArrayList arrayList2 = new ArrayList();
            for (brbv brbv : brby.f142339b) {
                brbu brbu3 = brbv.f142324a;
                if (brbu3 == null) {
                    brbu3 = brbu.f142318c;
                }
                Contact contact2 = new Contact((Contact) hashMap.get(brbu3.f142321b));
                contact2.f31291j = 15;
                arrayList2.add(contact2);
            }
            for (brbz brbz : brby.f142340c) {
                brbu brbu4 = brbz.f142344a;
                if (brbu4 == null) {
                    brbu4 = brbu.f142318c;
                }
                Contact contact3 = new Contact((Contact) hashMap.get(brbu4.f142321b));
                contact3.f31291j = 16;
                arrayList2.add(contact3);
            }
            return new why(true, arrayList2);
        } catch (chuw | gid e) {
            throw new wgx(e.getMessage(), e);
        } catch (wgx e2) {
            String valueOf3 = String.valueOf(e2.getMessage());
            if (valueOf3.length() == 0) {
                new String("Error directAdding: ");
            } else {
                "Error directAdding: ".concat(valueOf3);
            }
            sbw sbw2 = wgn.f50624a;
            return new why(false, arrayList);
        }
    }
}
