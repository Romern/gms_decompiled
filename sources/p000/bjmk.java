package p000;

import android.content.Intent;
import android.os.Bundle;
import java.util.HashMap;

/* renamed from: bjmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjmk extends bjhy {

    /* renamed from: p */
    private bwpx f122971p;

    public bjmk(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        if (i != 3000) {
            super.mo52014a(i, bjfd);
        } else if (bjfd.mo65080a() == 0) {
            ((bjml) ((bjhy) this).f122754m).mo65262a(bjfd.f122613a.getStringExtra("result"));
            mo65255r();
        } else {
            mo65256s();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjml bjml = (bjml) ((bjhy) this).f122754m;
        return bjml == null ? new bjml() : bjml;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        int i;
        HashMap hashMap = new HashMap();
        bxwc bxwc = this.f122971p.f160619c;
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            bwpw bwpw = (bwpw) bxwc.get(i2);
            hashMap.put(bwpw.f160611a, bwpw.f160612b);
        }
        bwpx bwpx = this.f122971p;
        if ((bwpx.f160617a & 2) != 0) {
            i = bwpx.f160620d;
        } else {
            i = -1;
        }
        String str = bwpx.f160618b;
        Intent a = bjfc.m103291a("droidGuardAction", this.f122639a.f122692a.f122724a, i, null);
        a.putExtra("flow_name", str);
        a.putExtra("content_binding", hashMap);
        mo65128n().mo65084a(3000, new bjfc(a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwpx.f160615f;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122971p = (bwpx) b;
    }
}
