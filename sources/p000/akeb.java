package p000;

import android.net.Uri;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import java.io.IOException;
import java.util.List;

/* renamed from: akeb */
final /* synthetic */ class akeb implements Runnable {

    /* renamed from: a */
    private final akgy f71706a;

    /* renamed from: b */
    private final ShareTarget f71707b;

    /* renamed from: c */
    private final ajud f71708c;

    /* renamed from: d */
    private final String f71709d;

    public akeb(akgy akgy, ShareTarget shareTarget, ajud ajud, String str) {
        this.f71706a = akgy;
        this.f71707b = shareTarget;
        this.f71708c = ajud;
        this.f71709d = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x025d  */
    public final void run() {
        ajud ajud;
        String str;
        ajud ajud2;
        int i;
        String str2;
        ajud ajud3;
        String str3;
        akgy akgy = this.f71706a;
        ShareTarget shareTarget = this.f71707b;
        ajud ajud4 = this.f71708c;
        String str4 = this.f71709d;
        akgy.f71953t = (long) ajvg.m59094a();
        akgy.f71945l.clear();
        ajud a = akgy.mo39371a(shareTarget, ajud4);
        a.mo38711a(shareTarget, new ajub(1).mo38916a());
        if (akgy.mo39427q(shareTarget).length > 0) {
            str = str4;
            ajud = a;
        } else if (akgy.mo39425p(shareTarget).length > 0) {
            str = str4;
            ajud = a;
        } else if (akgy.mo39428r(shareTarget).length > 0) {
            str = str4;
            ajud = a;
        } else {
            try {
                List list = shareTarget.f81034g;
                int size = list.size();
                ahiq[] ahiqArr = new ahiq[size];
                int i2 = 0;
                while (i2 < list.size()) {
                    FileAttachment fileAttachment = (FileAttachment) list.get(i2);
                    Uri uri = fileAttachment.f80884d;
                    if (uri == null) {
                        str3 = str4;
                        ajud3 = a;
                    } else {
                        str3 = str4;
                        ajud3 = a;
                        ahiq a2 = ahiq.m55837a(ahio.m55834a(akif.m59796a(akgy.f71939f, uri)), ahiq.m55836a());
                        ahiqArr[i2] = a2;
                        akgy.mo39382a(fileAttachment, a2.f67251a);
                    }
                    i2++;
                    str4 = str3;
                    a = ajud3;
                }
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                bnsl.mo68432a("akgy", "a", 2013, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68409a("Created file payloads of length %d", size);
                akgy.mo39417l(shareTarget).f71902i = ahiqArr;
                List list2 = shareTarget.f81033f;
                String str5 = "b";
                int size2 = list2.size();
                ahiq[] ahiqArr2 = new ahiq[size2];
                int i3 = 0;
                while (i3 < list2.size()) {
                    TextAttachment textAttachment = (TextAttachment) list2.get(i3);
                    ahiq a3 = ahiq.m55840a(textAttachment.f81048a.getBytes());
                    ahiqArr2[i3] = a3;
                    akgy.mo39382a(textAttachment, a3.f67251a);
                    i3++;
                    list2 = list2;
                    str5 = str5;
                }
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl2.mo68432a("akgy", str5, 2025, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68409a("Created text payloads of length %d", size2);
                akgy.mo39417l(shareTarget).f71901h = ahiqArr2;
                List list3 = shareTarget.f81035h;
                String str6 = "c";
                int size3 = list3.size();
                ahiq[] ahiqArr3 = new ahiq[size3];
                int i4 = 0;
                while (i4 < list3.size()) {
                    WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) list3.get(i4);
                    bxvd da = ajnx.f71031d.mo74144da();
                    List list4 = list3;
                    String str7 = wifiCredentialsAttachment.f81060d;
                    if (str7 != null) {
                        str2 = str6;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ajnx ajnx = (ajnx) da.f164949b;
                        str7.getClass();
                        i = size3;
                        ajnx.f71033a |= 1;
                        ajnx.f71034b = str7;
                    } else {
                        str2 = str6;
                        i = size3;
                    }
                    boolean z = wifiCredentialsAttachment.f81061e;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ajnx ajnx2 = (ajnx) da.f164949b;
                    ajnx2.f71033a |= 2;
                    ajnx2.f71035c = z;
                    ahiq a4 = ahiq.m55840a(((ajnx) da.mo74062i()).mo73642k());
                    ahiqArr3[i4] = a4;
                    akgy.mo39382a(wifiCredentialsAttachment, a4.f67251a);
                    i4++;
                    list3 = list4;
                    str6 = str2;
                    size3 = i;
                }
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl3.mo68432a("akgy", str6, 2048, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68409a("Created wifi payloads of length %d", size3);
                akgy.mo39417l(shareTarget).f71903j = ahiqArr3;
                if (akgy.mo39427q(shareTarget).length <= 0) {
                    if (akgy.mo39425p(shareTarget).length <= 0 && akgy.mo39428r(shareTarget).length <= 0) {
                        bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
                        bnsl4.mo68432a("akgy", "w", 1991, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68420a("Failed to create any payloads for ShareTarget %s.", shareTarget);
                        ajud4.mo38711a(shareTarget, new ajub(11).mo38916a());
                        return;
                    }
                }
                bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl5.mo68432a("akgy", "w", 1988, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68424a("Created %s payloads for ShareTarget %s.", shareTarget.mo44499b(), shareTarget);
                str = str4;
                ajud = a;
                if (shareTarget.f81038k) {
                    ajud2 = ajud;
                } else if (!akgy.f71950q.mo39245b(shareTarget)) {
                    ajud2 = ajud;
                } else {
                    bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl6.mo68432a("akgy", "a", 1425, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68420a("%s is outdated, attempting to rescan and send.", shareTarget);
                    akgy.mo39399b(str, shareTarget, ajud);
                    return;
                }
                if (akgy.mo39418m(shareTarget) != null) {
                    bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl7.mo68432a("akgy", "a", 1428, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl7.mo68420a("%s is not discovered yet, attempting to rescan and send.", shareTarget);
                    akgy.mo39399b(str, shareTarget, ajud2);
                    return;
                }
                bnsl bnsl8 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl8.mo68432a("akgy", "a", 1432, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl8.mo68420a("%s is not outdated, attempting to send.", shareTarget);
                akgy.mo39402c(str, shareTarget, ajud2);
                return;
            } catch (IOException e) {
                bnsl bnsl9 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl9.mo68437a(e);
                bnsl9.mo68432a("akgy", "w", 1995, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl9.mo68405a("Failed to create file payloads for the given attachments. Disconnecting.");
            }
        }
        bnsl bnsl10 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl10.mo68432a("akgy", "w", 1972, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl10.mo68420a("Skipping payload creation for ShareTarget %s. Payloads already created.", shareTarget);
        if (shareTarget.f81038k) {
        }
        if (akgy.mo39418m(shareTarget) != null) {
        }
    }
}
