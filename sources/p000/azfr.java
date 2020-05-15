package p000;

import android.content.Intent;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: azfr */
public final /* synthetic */ class azfr implements Runnable {

    /* renamed from: a */
    private final SilentRegisterIntentOperation f99243a;

    /* renamed from: b */
    private final Intent f99244b;

    public azfr(SilentRegisterIntentOperation silentRegisterIntentOperation, Intent intent) {
        this.f99243a = silentRegisterIntentOperation;
        this.f99244b = intent;
    }

    public final void run() {
        SilentRegisterIntentOperation silentRegisterIntentOperation = this.f99243a;
        Intent intent = this.f99244b;
        silentRegisterIntentOperation.mo60393e(intent);
        silentRegisterIntentOperation.mo60388b(intent);
        cbbl d = SilentRegisterIntentOperation.m94601d(intent);
        String valueOf = String.valueOf(d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("chatIntentApiArgs: ");
        sb.append(valueOf);
        sb.toString();
        silentRegisterIntentOperation.mo60389b(d);
        silentRegisterIntentOperation.f111107d = intent.getStringExtra("original_intent_action");
        String valueOf2 = String.valueOf(silentRegisterIntentOperation.f111107d);
        if (valueOf2.length() == 0) {
            new String("originalIntentAction: ");
        } else {
            "originalIntentAction: ".concat(valueOf2);
        }
        azqf.m86130a(silentRegisterIntentOperation.f111106c);
        if (!azqf.m86150c(silentRegisterIntentOperation.f111107d) || d.f176587k == null) {
            silentRegisterIntentOperation.mo60384a(d);
            if (cfcy.m138709b()) {
                silentRegisterIntentOperation.mo60386a("com.google.android.gms.matchstick.ui.EntryActivity", -1);
                return;
            }
            return;
        }
        bxvd da = bxte.f164763c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        "type.googleapis.com/google.internal.communications.instantmessaging.v1.ChatIntentApiArgs".getClass();
        ((bxte) da.f164949b).f164765a = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ChatIntentApiArgs";
        ByteString aL = d.mo73639aL();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aL.getClass();
        ((bxte) da.f164949b).f164766b = aL;
        bxte bxte = (bxte) da.mo74062i();
        cbds cbds = d.f176587k;
        if (cbds == null) {
            cbds = cbds.f176782e;
        }
        if (cfgs.m139404j()) {
            bxvd bxvd = (bxvd) cbds.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) cbds);
            String g = cfgs.f183989a.mo6606a().mo81192g();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            g.getClass();
            ((cbds) bxvd.f164949b).f176787d = g;
            cbds = (cbds) bxvd.mo74062i();
        }
        cbev cbev = (cbev) cbex.f176860f.mo74144da();
        if (cbev.f164950c) {
            cbev.mo74035c();
            cbev.f164950c = false;
        }
        cbds.getClass();
        ((cbex) cbev.f164949b).f176862a = cbds;
        if (cfeo.m138855L()) {
            ArrayList arrayList = new ArrayList();
            bxvw bxvw = d.f176588l;
            int size = bxvw.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(Long.valueOf(((Long) bxvw.get(i)).longValue()));
            }
            cbdn cbdn = (cbdn) cbdo.f176763b.mo74144da();
            cbdn.mo75225a(arrayList);
            cbdo cbdo = (cbdo) cbdn.mo74062i();
            if (cbev.f164950c) {
                cbev.mo74035c();
                cbev.f164950c = false;
            }
            cbdo.getClass();
            ((cbex) cbev.f164949b).f176864c = cbdo;
        }
        if (cfeo.m138854K()) {
            cbev.mo75230a(Collections.unmodifiableMap(d.f176590n));
        }
        cbev.mo75229a("MS", bxte);
        String a = boan.f132471e.mo68783a().mo68794a(((cbex) cbev.mo74062i()).serializeToBytes());
        Intent intent2 = new Intent("com.google.business.ACTION_MESSAGE");
        intent2.putExtra("args", a);
        azph.m85998a(silentRegisterIntentOperation.f111106c).mo55125a(1708);
        silentRegisterIntentOperation.mo60391c(intent2);
    }
}
