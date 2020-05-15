package p000;

import android.content.Context;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.Locale;
import java.util.Map;

/* renamed from: azgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azgz extends azgx {

    /* renamed from: a */
    private final Context f99333a;

    /* renamed from: g */
    private final MessagingService f99334g;

    public azgz(cbkj cbkj, Context context, MessagingService messagingService) {
        super(cbkj);
        this.f99333a = context;
        this.f99334g = messagingService;
        new Object[1][0] = this.f99326c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aznz mo54915a(cbkj cbkj, bxxc bxxc, LocalEntityId localEntityId) {
        cbij cbij = (cbij) bxxc;
        return null;
    }

    /* renamed from: a */
    public final void mo54860a(azbz azbz) {
    }

    /* renamed from: b */
    public final azdd mo54862b() {
        cbhw cbhw;
        cbhw cbhw2;
        LocalEntityId localEntityId;
        cbhw cbhw3;
        String str = this.f99327d.f111076c;
        Map j = azcd.m85252a(this.f99333a).mo54618j(str);
        String str2 = (String) j.get("images_hash_key");
        cbil cbil = (cbil) ((cbij) this.f99326c).f177253a.get(0);
        if (cbil.f177259a == 16) {
            cbhw = (cbhw) cbil.f177260b;
        } else {
            cbhw = cbhw.f177204e;
        }
        if (str2 == null) {
            cbhw2 = cbhw;
        } else {
            cbil cbil2 = (cbil) ((cbij) this.f99326c).f177253a.get(0);
            if (cbil2.f177259a == 16) {
                cbhw3 = (cbhw) cbil2.f177260b;
            } else {
                cbhw3 = cbhw.f177204e;
            }
            bxvd bxvd = (bxvd) cbhw3.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) cbhw3);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cbhw cbhw4 = cbhw.f177204e;
            str2.getClass();
            ((cbhw) bxvd.f164949b).f177208c = str2;
            cbhw2 = (cbhw) bxvd.mo74062i();
        }
        String str3 = (String) j.get("non_images_hash_key");
        MessagingService messagingService = this.f99334g;
        String language = Locale.ENGLISH.getLanguage();
        Context context = this.f99333a;
        aznz aznz = this.f99328e;
        if (aznz != null) {
            localEntityId = aznz.f99780g;
        } else {
            localEntityId = null;
        }
        azhh.m85697a(messagingService, language, cbhw2, context, localEntityId, str, str2, str3);
        return null;
    }

    /* renamed from: c */
    public final void mo54863c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo54916a(cbkj cbkj) {
        return (cbij) azol.m85935a((bxxk) cbij.f177251e.mo74142c(7), cbkj.f177411e.getKey());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ LocalEntityId mo54917a(cbkj cbkj, bxxc bxxc) {
        cbip cbip = ((cbij) bxxc).f177255c;
        if (cbip == null) {
            return null;
        }
        cbhu cbhu = cbip.f177283a;
        if (cbhu == null) {
            cbhu = cbhu.f177185d;
        }
        return LocalEntityId.m94549a(cbhu);
    }

    /* renamed from: a */
    public final boolean mo54861a() {
        int b;
        bxxc bxxc = this.f99326c;
        if (!(bxxc == null || this.f99327d == null)) {
            bxwc bxwc = ((cbij) bxxc).f177253a;
            if (bxwc.isEmpty() || (b = cbik.m127888b(((cbil) bxwc.get(0)).f177261c)) == 0 || b != 16) {
                return false;
            }
            return true;
        }
        return false;
    }
}
