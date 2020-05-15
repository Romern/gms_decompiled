package p000;

import android.net.Uri;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import java.io.File;
import java.util.List;

/* renamed from: akgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akgf extends akgx {

    /* renamed from: a */
    final /* synthetic */ akdd f71858a;

    /* renamed from: b */
    final /* synthetic */ ShareTarget f71859b;

    /* renamed from: c */
    final /* synthetic */ akgy f71860c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akgf(akgy akgy, ShareTarget shareTarget, ajud ajud, akdd akdd, ShareTarget shareTarget2) {
        super(akgy, shareTarget, ajud);
        this.f71860c = akgy;
        this.f71858a = akdd;
        this.f71859b = shareTarget2;
    }

    /* renamed from: a */
    public final boolean mo39352a() {
        Uri uri;
        this.f71858a.mo39250a(new akgd(this, this.f71859b));
        List list = this.f71859b.f81034g;
        int size = list.size();
        int i = 0;
        while (i < size) {
            FileAttachment fileAttachment = (FileAttachment) list.get(i);
            i++;
            akgy akgy = this.f71860c;
            long b = akgy.mo39393b((Attachment) fileAttachment);
            if (b != -1) {
                ahiq a = akgy.f71940g.mo39279a(b);
                if (a == null) {
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl.mo68432a("akgy", "a", 2166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Failed to update the location of %s. No payload found.", fileAttachment);
                } else {
                    ahio ahio = a.f67254d;
                    if (ahio == null) {
                        bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl2.mo68432a("akgy", "a", 2172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("Failed to update the location of %s. No file found.", fileAttachment);
                    } else {
                        File file = ahio.f67246a;
                        if (file == null) {
                            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
                            bnsl3.mo68432a("akgy", "a", 2178, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68420a("Cannot move attachment %s due to failure to get the Java file.", fileAttachment);
                        } else {
                            if (cfov.f185185a.mo6606a().mo82384h()) {
                                if (ssw.m36269a()) {
                                    uri = akgy.mo39372a(file, fileAttachment);
                                } else {
                                    uri = null;
                                }
                                if (uri == null) {
                                    uri = akgy.mo39373a(file, akgy.m59557b(fileAttachment), fileAttachment);
                                }
                            } else if (ssw.m36269a()) {
                                uri = akgy.mo39372a(file, fileAttachment);
                            } else {
                                uri = akgy.mo39373a(file, akgy.m59557b(fileAttachment), fileAttachment);
                            }
                            if (uri != null) {
                                akgk akgk = (akgk) akgy.f71935b.get(fileAttachment);
                                if (akgk == null) {
                                    akgk = new akgk();
                                    akgy.f71935b.put(fileAttachment, akgk);
                                }
                                akgk.f71875a = uri;
                            }
                        }
                    }
                }
            } else {
                bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl4.mo68432a("akgy", "a", 2159, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("Failed to update the location of %s. No payload ID found.", fileAttachment);
            }
            return false;
        }
        akgy.m59565l();
        List list2 = this.f71859b.f81033f;
        int size2 = list2.size();
        int i2 = 0;
        while (i2 < size2) {
            TextAttachment textAttachment = (TextAttachment) list2.get(i2);
            i2++;
            akgy akgy2 = this.f71860c;
            long b2 = akgy2.mo39393b(textAttachment);
            if (b2 != -1) {
                ahiq a2 = akgy2.f71940g.mo39279a(b2);
                if (a2 != null) {
                    byte[] bArr = a2.f67253c;
                    if (!akid.m59787a(bArr)) {
                        String str = new String(bArr);
                        akgk akgk2 = (akgk) akgy2.f71935b.get(textAttachment);
                        if (akgk2 == null) {
                            akgk2 = new akgk();
                            akgy2.f71935b.put(textAttachment, akgk2);
                        }
                        akgk2.f71878d = str;
                    } else {
                        bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl5.mo68432a("akgy", "a", 2140, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68420a("Failed to receive text body of %s. Incoming bytes is empty.", textAttachment);
                    }
                } else {
                    bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl6.mo68432a("akgy", "a", 2134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68420a("Failed to receive text body of %s. No payload found.", textAttachment);
                }
            } else {
                bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl7.mo68432a("akgy", "a", 2128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl7.mo68420a("Failed to receive text body of %s. No payload ID found.", textAttachment);
            }
            return false;
        }
        List list3 = this.f71859b.f81035h;
        int size3 = list3.size();
        int i3 = 0;
        while (i3 < size3) {
            WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) list3.get(i3);
            i3++;
            akgy akgy3 = this.f71860c;
            long b3 = akgy3.mo39393b((Attachment) wifiCredentialsAttachment);
            if (b3 != -1) {
                ahiq a3 = akgy3.f71940g.mo39279a(b3);
                if (a3 != null) {
                    byte[] bArr2 = a3.f67253c;
                    if (!akid.m59787a(bArr2)) {
                        try {
                            ajnx ajnx = (ajnx) bxvk.m124016a(ajnx.f71031d, bArr2, bxus.m123744c());
                            akgk akgk3 = (akgk) akgy3.f71935b.get(wifiCredentialsAttachment);
                            if (akgk3 == null) {
                                akgk3 = new akgk();
                                akgy3.f71935b.put(wifiCredentialsAttachment, akgk3);
                            }
                            akgk3.f71876b = ajnx;
                        } catch (bxwf e) {
                            bnsl bnsl8 = (bnsl) ajvp.f71371a.mo68388c();
                            bnsl8.mo68437a(e);
                            bnsl8.mo68432a("akgy", "a", 2120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl8.mo68420a("Failed to receive Wi-Fi credential of %s.", wifiCredentialsAttachment);
                        }
                    } else {
                        bnsl bnsl9 = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl9.mo68432a("akgy", "a", 2109, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl9.mo68420a("Failed to receive Wi-Fi credential of %s. No file found.", wifiCredentialsAttachment);
                    }
                } else {
                    bnsl bnsl10 = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl10.mo68432a("akgy", "a", 2102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl10.mo68420a("Failed to receive Wi-Fi credential of %s. No payload found.", wifiCredentialsAttachment);
                }
            } else {
                bnsl bnsl11 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl11.mo68432a("akgy", "a", 2095, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl11.mo68420a("Failed to receive Wi-Fi credential %s. No payload ID found.", wifiCredentialsAttachment);
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo39353b() {
        ahio ahio;
        File file;
        List b = this.f71859b.mo44499b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            Attachment attachment = (Attachment) b.get(i);
            akgy akgy = this.f71860c;
            long b2 = akgy.mo39393b(attachment);
            if (b2 == -1) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                bnsl.mo68432a("akgy", "a", 2384, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Failed to retrieve payload for: %s", attachment);
            } else {
                ahiq a = akgy.f71940g.mo39279a(b2);
                if (!(a == null || (ahio = a.f67254d) == null || (file = ahio.f67246a) == null)) {
                    file.delete();
                }
            }
        }
        akgy.m59565l();
    }
}
