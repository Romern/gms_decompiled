package p000;

import android.content.Intent;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import java.util.Collections;

/* renamed from: azfp */
public final /* synthetic */ class azfp implements Runnable {

    /* renamed from: a */
    private final SilentRegisterIntentOperation f99239a;

    /* renamed from: b */
    private final Intent f99240b;

    public azfp(SilentRegisterIntentOperation silentRegisterIntentOperation, Intent intent) {
        this.f99239a = silentRegisterIntentOperation;
        this.f99240b = intent;
    }

    public final void run() {
        SilentRegisterIntentOperation silentRegisterIntentOperation = this.f99239a;
        Intent intent = this.f99240b;
        silentRegisterIntentOperation.mo60393e(intent);
        silentRegisterIntentOperation.mo60388b(intent);
        cbbl d = SilentRegisterIntentOperation.m94601d(intent);
        bxvd da = bxte.f164763c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        "type.googleapis.com/google.internal.communications.instantmessaging.v1.ChatIntentApiArgs".getClass();
        ((bxte) da.f164949b).f164765a = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ChatIntentApiArgs";
        bxtx aL = d.mo73639aL();
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
            bxvd.mo73625a((bxvk) cbds);
            String e = cfgs.m139399e();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            e.getClass();
            ((cbds) bxvd.f164949b).f176787d = e;
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
            cbdn cbdn = (cbdn) cbdo.f176763b.mo74144da();
            cbdn.mo75225a(d.f176588l);
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
        cbev.mo75229a(cfeo.m138848E(), bxte);
        String a = boan.f132471e.mo68783a().mo68794a(((cbex) cbev.mo74062i()).mo73642k());
        Intent intent2 = new Intent("com.google.business.ACTION_MESSAGE");
        intent2.putExtra("args", a);
        if (cfgs.m139387G() && intent.hasExtra("broadcast_account_conversation_id")) {
            intent2.putExtra("broadcast_account_conversation_id", intent.getBooleanExtra("broadcast_account_conversation_id", true));
        }
        silentRegisterIntentOperation.mo60383a(intent2);
    }
}
