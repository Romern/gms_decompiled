package p000;

import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;

/* renamed from: bcli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcli {
    /* renamed from: a */
    public static cbdl m89240a(ConversationId conversationId) {
        if (conversationId.mo60556c() == ConversationId.IdType.GROUP) {
            bxvd da = cbdl.f176754d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbdl) da.f164949b).f176758c = cbej.m127774a(4);
            bxvd da2 = cbdi.f176736c.mo74144da();
            String a = conversationId.mo60557d().mo60503a();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            a.getClass();
            ((cbdi) da2.f164949b).f176738a = a;
            String b = conversationId.mo60557d().mo60504b();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            b.getClass();
            ((cbdi) da2.f164949b).f176739b = b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbdl cbdl = (cbdl) da.f164949b;
            cbdi cbdi = (cbdi) da2.mo74062i();
            cbdi.getClass();
            cbdl.f176757b = cbdi;
            cbdl.f176756a = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
            return (cbdl) da.mo74062i();
        }
        cbds a2 = bclk.m89245a(conversationId.mo60498a());
        cbds a3 = bclk.m89245a(conversationId.mo60558e());
        bxvd da3 = cbdl.f176754d.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        ((cbdl) da3.f164949b).f176758c = cbej.m127774a(3);
        cbdz cbdz = (cbdz) cbea.f176814b.mo74144da();
        cbdz.mo75226a(a2);
        cbdz.mo75226a(a3);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        cbdl cbdl2 = (cbdl) da3.f164949b;
        cbea cbea = (cbea) cbdz.mo74062i();
        cbea.getClass();
        cbdl2.f176757b = cbea;
        cbdl2.f176756a = 101;
        return (cbdl) da3.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [bxwc, bmxj]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    /* renamed from: a */
    public static ConversationId m89241a(bcoh bcoh, cbdl cbdl) {
        cbea cbea;
        cbdi cbdi;
        cbdi cbdi2;
        ContactId e = bcoh.mo57058b().mo57074e();
        int i = cbdl.f176758c;
        char c = 2;
        if (i != 0) {
            c = i != 1 ? i != 2 ? (char) 0 : 4 : 3;
        }
        if (c != 0 && c == 4) {
            bcsq f = ConversationId.m94839f();
            bcsr c2 = ConversationId.GroupId.m94847c();
            if (cbdl.f176756a == 103) {
                cbdi = (cbdi) cbdl.f176757b;
            } else {
                cbdi = cbdi.f176736c;
            }
            c2.mo57478b(cbdi.f176738a);
            if (cbdl.f176756a == 103) {
                cbdi2 = (cbdi) cbdl.f176757b;
            } else {
                cbdi2 = cbdi.f176736c;
            }
            c2.mo57477a(cbdi2.f176739b);
            f.mo57474a(c2.mo57476a());
            f.mo57473a(e);
            return f.mo57472a();
        }
        if (cbdl.f176756a == 101) {
            cbea = (cbea) cbdl.f176757b;
        } else {
            cbea = cbea.f176814b;
        }
        List a = bnkn.m109668a((List) cbea.f176816a, bclh.f104431a);
        bcsq f2 = ConversationId.m94839f();
        f2.mo57475b((ContactId) bnjd.m109597e(a, bmyf.m108613a(bmyf.m108614a(e))));
        f2.mo57473a(bcoh.mo57058b().mo57074e());
        return f2.mo57472a();
    }
}
