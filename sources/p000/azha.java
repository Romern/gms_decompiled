package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: azha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azha extends azgx {

    /* renamed from: a */
    final LocalEntityId f99335a;

    /* renamed from: g */
    private final Context f99336g;

    /* renamed from: h */
    private final azet f99337h;

    public azha(cbkj cbkj, Context context, azet azet) {
        super(cbkj);
        this.f99336g = context;
        this.f99337h = azet;
        cbma cbma = cbkj.f177414h;
        this.f99335a = LocalEntityId.m94551b(cbma == null ? cbma.f177591f : cbma);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aznz mo54915a(cbkj cbkj, bxxc bxxc, LocalEntityId localEntityId) {
        cblu cblu = (cblu) bxxc;
        return null;
    }

    /* renamed from: a */
    public final void mo54860a(azbz azbz) {
    }

    /* renamed from: b */
    public final azdd mo54862b() {
        this.f99337h.mo54843a(Collections.singletonList(this.f99325b));
        int a = cipn.m150698a(((cblu) this.f99326c).f177567c);
        if (a != 0 && a == 8) {
            Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.UPLOAD_PREKEYS");
            azoi.m85926a(intent, this.f99335a);
            MessagingService.m94557b(intent, this.f99336g);
        } else {
            int a2 = cipn.m150698a(((cblu) this.f99326c).f177567c);
            if (a2 != 0 && a2 == 11) {
                cblu cblu = (cblu) this.f99326c;
                if (cblu.f177565a == 108) {
                    cbnf cbnf = (cbnf) cblu.f177566b;
                    cbno cbno = cbnf.f177725a;
                    if (cbno == null || cbno.f177745a.size() == 0) {
                        azph.m85998a(this.f99336g).mo55170c(1107, 25);
                        azoj.m85933c("UserDataMsgHandler", "Change account info push received with no reachable IDs", new Object[0]);
                        return null;
                    }
                    cbno cbno2 = cbnf.f177725a;
                    if (cbno2 == null) {
                        cbno2 = cbno.f177743b;
                    }
                    bxwc bxwc = cbno2.f177745a;
                    bxwc bxwc2 = cbnf.f177726b;
                    if (bxwc2.isEmpty() || ((cbmq) bxwc2.get(0)).f177668a.mo73779j()) {
                        azph.m85998a(this.f99336g).mo55170c(1107, 25);
                        azoj.m85933c("UserDataMsgHandler", "Change account info push received with no registration ID", new Object[0]);
                        return null;
                    }
                    byte[] k = ((cbmq) bxwc2.get(0)).f177668a.getKey();
                    ArrayList arrayList = new ArrayList();
                    int size = bxwc.size();
                    for (int i = 0; i < size; i++) {
                        cbma cbma = (cbma) bxwc.get(i);
                        if (azof.m85913a(cbma)) {
                            arrayList.add(LocalEntityId.m94551b(cbma));
                        } else {
                            azoj.m85933c("UserDataMsgHandler", "Invalid reachable id. Not saving account to database", new Object[0]);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        azph.m85998a(this.f99336g).mo55170c(1107, 25);
                        azoj.m85933c("UserDataMsgHandler", "Change account info push received with no valid reachable users", new Object[0]);
                        return null;
                    }
                    azct a3 = azcv.m85357a(this.f99336g).mo54690a(k);
                    if (a3 == null || !a3.mo54688a()) {
                        azph.m85998a(this.f99336g).mo55170c(1107, 49);
                        azoj.m85933c("UserDataMsgHandler", "Change account info push received for non-existent registration", new Object[0]);
                        return null;
                    }
                    azcv.m85357a(this.f99336g).mo54696a(k, arrayList);
                    azph.m85998a(this.f99336g).mo55141a(1106, this.f99335a);
                } else {
                    azph.m85998a(this.f99336g).mo55170c(1107, 25);
                    azoj.m85933c("UserDataMsgHandler", "Null ChangeAccountInfoPush message", new Object[0]);
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo54863c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo54916a(cbkj cbkj) {
        return (cblu) azol.m85935a((bxxk) cblu.f177563d.mo74142c(7), cbkj.f177411e.getKey());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ LocalEntityId mo54917a(cbkj cbkj, bxxc bxxc) {
        cblu cblu = (cblu) bxxc;
        return null;
    }

    /* renamed from: a */
    public final boolean mo54861a() {
        bxxc bxxc = this.f99326c;
        if (bxxc != null) {
            int a = cipn.m150698a(((cblu) bxxc).f177567c);
            if (a != 0 && a == 8) {
                return true;
            }
            int a2 = cipn.m150698a(((cblu) this.f99326c).f177567c);
            if (a2 == 0 || a2 != 11) {
                return false;
            }
            return true;
        }
        return false;
    }
}
