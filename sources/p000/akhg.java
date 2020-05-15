package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: akhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akhg extends Handler implements akcd {

    /* renamed from: a */
    private ajud f71983a;

    /* renamed from: b */
    private ajud f71984b;

    /* renamed from: c */
    private ajsn f71985c;

    /* renamed from: d */
    private final Set f71986d = new C1225nr();

    /* renamed from: e */
    private final Set f71987e = new C1225nr();

    public akhg() {
        super(Looper.getMainLooper());
    }

    /* renamed from: a */
    private static Message m59684a(int i, ShareTarget shareTarget) {
        return m59685a(i, shareTarget, -1);
    }

    /* renamed from: a */
    public final int mo38779a(Contact contact) {
        return 13;
    }

    /* renamed from: a */
    public final void mo38782a(int i) {
    }

    /* renamed from: b */
    public final int mo38787b(Contact contact) {
        return 13;
    }

    /* renamed from: c */
    public final synchronized int mo38790c(ShareTarget shareTarget) {
        return 0;
    }

    /* renamed from: d */
    public final synchronized int mo38792d(ShareTarget shareTarget) {
        removeMessages(5, shareTarget);
        removeMessages(2, shareTarget);
        removeMessages(3, shareTarget);
        sendMessage(m59684a(7, shareTarget));
        return 0;
    }

    /* renamed from: d */
    public final void mo38793d() {
    }

    /* renamed from: e */
    public final void mo38794e() {
    }

    /* renamed from: f */
    public final List mo38795f() {
        return bngx.m109376e();
    }

    /* renamed from: g */
    public final void mo38796g() {
    }

    /* renamed from: h */
    public final synchronized void mo38797h() {
        removeMessages(1);
        removeMessages(2);
        removeMessages(3);
        removeMessages(4);
        removeMessages(5);
        removeMessages(6);
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Mock event provider shutting down");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x025b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0123, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0198, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f9, code lost:
        return;
     */
    public final synchronized void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (this.f71983a != null) {
                    ShareTarget shareTarget = (ShareTarget) akik.m59825a(message.getData().getByteArray("share_target_bytes"), ShareTarget.CREATOR);
                    this.f71986d.add(shareTarget);
                    ajub ajub = new ajub(2);
                    if (shareTarget.f81037j == null) {
                        ajub.f71284a = "BCD2A";
                    }
                    this.f71983a.mo38711a(shareTarget, ajub.mo38916a());
                    ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Mock incoming file injected");
                    break;
                }
                break;
            case 2:
                ShareTarget shareTarget2 = (ShareTarget) akik.m59825a(message.getData().getByteArray("share_target_bytes"), ShareTarget.CREATOR);
                if (this.f71986d.contains(shareTarget2) || this.f71987e.contains(shareTarget2)) {
                    int i = message.getData().getInt("progress");
                    ajub ajub2 = new ajub(5);
                    ajub2.mo38917a((float) i);
                    TransferMetadata a = ajub2.mo38916a();
                    if (this.f71986d.contains(shareTarget2)) {
                        ajud ajud = this.f71983a;
                        if (ajud != null) {
                            ajud.mo38711a(shareTarget2, a);
                        }
                    } else {
                        ajud ajud2 = this.f71984b;
                        if (ajud2 != null) {
                            ajud2.mo38711a(shareTarget2, a);
                        }
                    }
                    ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Mock file progress injected");
                    return;
                }
                break;
            case 3:
                ShareTarget shareTarget3 = (ShareTarget) akik.m59825a(message.getData().getByteArray("share_target_bytes"), ShareTarget.CREATOR);
                if (this.f71986d.contains(shareTarget3) || this.f71987e.contains(shareTarget3)) {
                    ajub ajub3 = new ajub(6);
                    ajub3.mo38917a(100.0f);
                    TransferMetadata a2 = ajub3.mo38916a();
                    if (this.f71986d.contains(shareTarget3)) {
                        ajud ajud3 = this.f71983a;
                        if (ajud3 != null) {
                            ajud3.mo38711a(shareTarget3, a2);
                            this.f71986d.remove(shareTarget3);
                        }
                    } else {
                        ajud ajud4 = this.f71984b;
                        if (ajud4 != null) {
                            ajud4.mo38711a(shareTarget3, a2);
                            this.f71987e.remove(shareTarget3);
                        }
                    }
                    ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Mock file complete injected");
                    return;
                }
                break;
            case 4:
                if (this.f71985c != null) {
                    this.f71985c.mo38707a((ShareTarget) akik.m59825a(message.getData().getByteArray("share_target_bytes"), ShareTarget.CREATOR));
                    ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Mock discovered shareTarget injected");
                    break;
                }
                break;
            case 5:
                if (this.f71984b != null) {
                    ShareTarget shareTarget4 = (ShareTarget) akik.m59825a(message.getData().getByteArray("share_target_bytes"), ShareTarget.CREATOR);
                    this.f71984b.mo38711a(shareTarget4, new ajub(1).mo38916a());
                    if (shareTarget4.f81037j != null) {
                        m59686a(shareTarget4, 2000);
                    } else {
                        sendMessageDelayed(m59684a(8, shareTarget4), 1000);
                    }
                    ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Mock connect injected");
                    return;
                }
                return;
            case 6:
                ShareTarget shareTarget5 = (ShareTarget) akik.m59825a(message.getData().getByteArray("share_target_bytes"), ShareTarget.CREATOR);
                if (this.f71986d.contains(shareTarget5) || this.f71987e.contains(shareTarget5)) {
                    ajub ajub4 = new ajub(7);
                    ajub4.mo38917a(100.0f);
                    TransferMetadata a3 = ajub4.mo38916a();
                    if (this.f71986d.contains(shareTarget5)) {
                        ajud ajud5 = this.f71983a;
                        if (ajud5 != null) {
                            ajud5.mo38711a(shareTarget5, a3);
                            this.f71986d.remove(shareTarget5);
                        }
                    } else {
                        ajud ajud6 = this.f71984b;
                        if (ajud6 != null) {
                            ajud6.mo38711a(shareTarget5, a3);
                            this.f71987e.remove(shareTarget5);
                        }
                    }
                    ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Mock file fail injected");
                    return;
                }
                break;
            case 7:
                ShareTarget shareTarget6 = (ShareTarget) akik.m59825a(message.getData().getByteArray("share_target_bytes"), ShareTarget.CREATOR);
                if (!this.f71986d.contains(shareTarget6)) {
                    if (!this.f71987e.contains(shareTarget6)) {
                        ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("Unknown ShareTarget %s was cancelled. Ignoring.", shareTarget6);
                        return;
                    }
                }
                ajub ajub5 = new ajub(9);
                ajub5.mo38917a(100.0f);
                TransferMetadata a4 = ajub5.mo38916a();
                if (this.f71986d.contains(shareTarget6)) {
                    ajud ajud7 = this.f71983a;
                    if (ajud7 == null) {
                        ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("Failed to cancel ShareTarget %s. No callback to invoke.", shareTarget6);
                        return;
                    } else {
                        ajud7.mo38711a(shareTarget6, a4);
                        this.f71986d.remove(shareTarget6);
                    }
                } else {
                    ajud ajud8 = this.f71984b;
                    if (ajud8 == null) {
                        ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("Failed to cancel ShareTarget %s. No callback to invoke.", shareTarget6);
                        return;
                    } else {
                        ajud8.mo38711a(shareTarget6, a4);
                        this.f71987e.remove(shareTarget6);
                    }
                }
                ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Mock file cancel injected");
                return;
            case 8:
                if (this.f71984b != null) {
                    ajud ajud9 = this.f71984b;
                    ajub ajub6 = new ajub(2);
                    ajub6.f71284a = "BCD2A";
                    ajud9.mo38711a((ShareTarget) akik.m59825a(message.getData().getByteArray("share_target_bytes"), ShareTarget.CREATOR), ajub6.mo38916a());
                    break;
                }
                break;
        }
    }

    /* renamed from: a */
    private static Message m59685a(int i, ShareTarget shareTarget, int i2) {
        Message message = new Message();
        message.what = i;
        message.obj = shareTarget;
        Bundle bundle = new Bundle();
        bundle.putByteArray("share_target_bytes", sef.m35074a(shareTarget));
        if (i2 != -1) {
            bundle.putInt("progress", i2);
        }
        message.setData(bundle);
        return message;
    }

    /* renamed from: b */
    public final synchronized int mo38788b(ShareTarget shareTarget) {
        if (this.f71986d.contains(shareTarget)) {
            this.f71986d.remove(shareTarget);
            ajud ajud = this.f71983a;
            if (ajud != null) {
                ajud.mo38711a(shareTarget, new ajub(8).mo38916a());
                this.f71983a = null;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public final synchronized List mo38791c() {
        return new ArrayList();
    }

    /* renamed from: b */
    public final synchronized void mo38789b() {
        removeMessages(1);
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Mock advertising stopped");
    }

    /* renamed from: a */
    private final void m59686a(ShareTarget shareTarget, int i) {
        int i2 = 0;
        while (i2 < 100) {
            sendMessageDelayed(m59685a(2, shareTarget, i2), (long) i);
            i2++;
            i += 100;
        }
        sendMessageDelayed(m59684a(3, shareTarget), (long) i);
    }

    /* renamed from: a */
    private final void m59687a(String str, String str2, boolean z, long j) {
        ajsl ajsl = new ajsl();
        ajsl.f71230b = str;
        ajsl.f71238j = str2;
        ajsl.f71242n = z;
        ajsl.f71237i = false;
        if (str2 != null) {
            ajsl.mo38888b();
        }
        sendMessageDelayed(m59684a(4, ajsl.mo38887a()), j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        return 0;
     */
    /* renamed from: a */
    public final synchronized int mo38780a(ShareTarget shareTarget) {
        if (!this.f71986d.contains(shareTarget) && shareTarget.f81036i) {
            return 0;
        }
        if (this.f71987e.contains(shareTarget) || shareTarget.f81036i) {
            m59686a(shareTarget, 0);
        }
    }

    /* renamed from: a */
    public final synchronized void mo38781a() {
        removeMessages(4);
        this.f71985c = null;
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Mock discovery stopped");
    }

    /* renamed from: a */
    public final synchronized void mo38783a(ajsn ajsn, akbz akbz) {
        this.f71985c = ajsn;
        m59687a("Alice's Chromebook", null, false, 1000);
        m59687a("Bob's Pixel 3", "Bob Smith", false, 2000);
        m59687a("Charlie's iPhone", null, true, 3000);
        m59687a("Dennis's Smartwatch", "Dennis Smith", true, 4000);
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Mock discovery started");
    }

    /* renamed from: a */
    public final void mo38784a(PrintWriter printWriter) {
        printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.provider.testing.MockEventProvider"));
    }

    /* renamed from: a */
    public final synchronized void mo38785a(String str, ajud ajud, akbw akbw) {
        if (akbw.f71567a == akcc.HIGH_POWER) {
            this.f71983a = ajud;
            ajsl ajsl = new ajsl();
            ajsl.f71230b = "Alice's Pixel 2";
            ajsl.f71238j = null;
            ajsl.f71237i = true;
            ShareTarget a = ajsl.mo38887a();
            ajja ajja = new ajja("Foo.pdf");
            ajja.f70732b = 1000;
            a.mo44496a(ajja.mo38689a());
            sendMessageDelayed(m59684a(1, a), 2000);
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Mock advertising started");
        }
    }

    /* renamed from: a */
    public final synchronized void mo38786a(String str, ShareTarget shareTarget, ajud ajud) {
        if (!this.f71987e.contains(shareTarget)) {
            this.f71984b = ajud;
            this.f71987e.add(shareTarget);
            ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("Sending to ShareTarget %s", shareTarget);
            sendMessage(m59684a(5, shareTarget));
        }
    }
}
