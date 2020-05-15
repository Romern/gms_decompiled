package p000;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.Arrays;
import java.util.List;

/* renamed from: azgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azgd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f99265a;

    /* renamed from: b */
    final /* synthetic */ Intent f99266b;

    /* renamed from: c */
    final /* synthetic */ azef f99267c;

    public azgd(Context context, Intent intent, azef azef) {
        this.f99265a = context;
        this.f99266b = intent;
        this.f99267c = azef;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04e3  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04e6  */
    public final void run() {
        char c;
        LocalEntityId localEntityId;
        LocalEntityId localEntityId2;
        aznz aznz;
        int i;
        bngx bngx;
        int i2;
        azcm azcm;
        bmxv bmxv;
        bmxv bmxv2;
        bmxv bmxv3;
        bxvd bxvd;
        cbma b;
        Context context = this.f99265a;
        Intent intent = this.f99266b;
        azef azef = this.f99267c;
        String action = intent.getAction();
        int i3 = 4;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        switch (action.hashCode()) {
            case -1882923940:
                if (action.equals("com.google.android.apps.libraries.matchstick.action.BLOCK_USER")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1584779440:
                if (action.equals("com.google.android.apps.libraries.matchstick.action.BLOCK_APP")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1430717622:
                if (action.equals("com.google.android.apps.libraries.matchstick.action.SYNC_BLOCKED_APPS")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 337786648:
                if (action.equals("com.google.android.apps.libraries.matchstick.action.TRIGGER_SPAM_SIGNAL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 555580567:
                if (action.equals("com.google.android.apps.libraries.matchstick.action.UNBLOCK_APP")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            String stringExtra = intent.getStringExtra("conversation_id");
            if (!TextUtils.isEmpty(stringExtra)) {
                aznz a = aznz.m85891a(stringExtra);
                if (a == null || !a.mo55105c()) {
                    azoj.m85933c("AbuseIntentHandler", "Invalid conversation ID has been passed", new Object[0]);
                    return;
                }
                localEntityId = azcm.m85300a(context).mo54644a(a);
            } else {
                String stringExtra2 = intent.getStringExtra("entity_id");
                int intExtra = intent.getIntExtra("entity_type", -1);
                String stringExtra3 = intent.getStringExtra("server_app_id");
                localEntityId = TextUtils.isEmpty(stringExtra2) ? null : (intExtra == -1 || TextUtils.isEmpty(stringExtra3)) ? null : new LocalEntityId(stringExtra2, intExtra, stringExtra3);
            }
            if (localEntityId == null) {
                azoj.m85933c("AbuseIntentHandler", "Empty Conversation ID and no Entity in intent. No user to block", new Object[0]);
            } else if (cfec.m138765b()) {
                List d = azcv.m85357a(context).mo54702d();
                int size = d.size();
                for (int i6 = 0; i6 < size; i6++) {
                    azfo.m85593a(context);
                    azef.mo54827a((LocalEntityId) d.get(i6), localEntityId, azfo.m85594b(intent));
                }
            } else {
                LocalEntityId a2 = azef.mo54824a();
                azfo.m85593a(context);
                azef.mo54827a(a2, localEntityId, azfo.m85594b(intent));
            }
        } else if (c == 1) {
            int intExtra2 = intent.getIntExtra("spam_signal", 0);
            if (intExtra2 == 0) {
                i3 = 2;
            } else if (intExtra2 == 1) {
                i3 = 3;
            } else if (intExtra2 != 2) {
                i3 = intExtra2 != 6 ? 0 : 8;
            }
            if (i3 == 0) {
                i3 = 2;
            }
            boolean booleanExtra = intent.getBooleanExtra("share_last_messages", false);
            boolean booleanExtra2 = intent.getBooleanExtra("block_conversation", false);
            String stringExtra4 = intent.getStringExtra("conversation_id");
            LocalEntityId a3 = azoi.m85924a(intent);
            if (a3 == null) {
                localEntityId2 = azef.mo54824a();
            } else {
                localEntityId2 = a3;
            }
            if (i3 == 2) {
                return;
            }
            if (booleanExtra && TextUtils.isEmpty(stringExtra4)) {
                return;
            }
            if (!booleanExtra2 || !TextUtils.isEmpty(stringExtra4)) {
                String stringExtra5 = intent.getStringExtra("entity_id");
                int intExtra3 = intent.getIntExtra("entity_type", 0);
                String stringExtra6 = intent.getStringExtra("server_app_id");
                if (i3 != 3 || (!TextUtils.isEmpty(stringExtra5) && intExtra3 != 0)) {
                    LocalEntityId localEntityId3 = !TextUtils.isEmpty(stringExtra5) ? new LocalEntityId(stringExtra5, intExtra3, stringExtra6) : null;
                    String stringExtra7 = intent.getStringExtra("inbox_msg_id");
                    boolean booleanExtra3 = intent.getBooleanExtra("is_sender_in_contacts", false);
                    if (!TextUtils.isEmpty(stringExtra4)) {
                        aznz = aznz.m85891a(stringExtra4);
                    } else {
                        aznz = null;
                    }
                    if (!booleanExtra) {
                        i2 = i3;
                    } else if (aznz != null) {
                        azcm a4 = azcm.m85300a(context);
                        long aZ = cfeo.f183719a.mo6606a().mo80966aZ();
                        bngs j = bngx.m109377j();
                        Cursor a5 = a4.mo54639a(a4.f98996b, aznz.f99774a, String.valueOf((int) aZ));
                        if (a5 != null) {
                            if (a5.moveToFirst()) {
                                while (true) {
                                    azdd a6 = azdd.m85387a(a5);
                                    Context context2 = a4.f98995a;
                                    a6.mo54712a();
                                    if (a6.mo54712a().length != 0) {
                                        bxvd da = cbkj.f177405k.mo74144da();
                                        String str = a6.f99046b;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = z;
                                        }
                                        cbkj cbkj = (cbkj) da.f164949b;
                                        str.getClass();
                                        cbkj.f177409c = str;
                                        cbkj.f177416j = cbkh.m127935a(2);
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        ((cbkj) da.f164949b).f177410d = cbki.m127937a(15);
                                        if (!(localEntityId2 == null || (b = localEntityId2.mo60371b()) == null)) {
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            b.getClass();
                                            ((cbkj) da.f164949b).f177414h = b;
                                        }
                                        long j2 = a6.f99054j;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        ((cbkj) da.f164949b).f177412f = j2;
                                        cbii cbii = (cbii) cbij.f177251e.mo74144da();
                                        bxvd da2 = cbie.f177232b.mo74144da();
                                        bxvd da3 = cbid.f177228c.mo74144da();
                                        aznz a7 = aznz.m85891a(a6.mo54714c());
                                        if (a7 == null) {
                                            bmxv2 = bmvz.f131120a;
                                            azcm = a4;
                                            i = i3;
                                        } else {
                                            if (a7.mo55104b()) {
                                                String str2 = a7.f99777d;
                                                azcm = a4;
                                                if (da3.f164950c) {
                                                    da3.mo74035c();
                                                    da3.f164950c = false;
                                                }
                                                cbid cbid = (cbid) da3.f164949b;
                                                str2.getClass();
                                                i = i3;
                                                cbid.f177230a = 1;
                                                cbid.f177231b = str2;
                                            } else {
                                                azcm = a4;
                                                i = i3;
                                                LocalEntityId a8 = azcm.m85300a(context2).mo54644a(a7);
                                                if (a8 != null) {
                                                    String str3 = a8.f111074a;
                                                    if (da3.f164950c) {
                                                        da3.mo74035c();
                                                        da3.f164950c = false;
                                                    }
                                                    cbid cbid2 = (cbid) da3.f164949b;
                                                    str3.getClass();
                                                    cbid2.f177230a = 2;
                                                    cbid2.f177231b = str3;
                                                } else {
                                                    bmxv2 = bmvz.f131120a;
                                                }
                                            }
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            cbid cbid3 = (cbid) da3.mo74062i();
                                            cbid3.getClass();
                                            ((cbie) da2.f164949b).f177234a = cbid3;
                                            bmxv2 = bmxv.m108566b((cbie) da2.mo74062i());
                                        }
                                        if (bmxv2.mo66813a()) {
                                            cbie cbie = (cbie) bmxv2.mo66814b();
                                            if (cbii.f164950c) {
                                                cbii.mo74035c();
                                                cbii.f164950c = false;
                                            }
                                            cbie.getClass();
                                            ((cbij) cbii.f164949b).f177254b = cbie;
                                            bxvd da4 = cbip.f177281c.mo74144da();
                                            if (a6.f99057m == -2) {
                                                cbhu a9 = LocalEntityId.m94551b(azfn.m85574a(azdl.m85412a(context2).mo54738a(), cfeo.m138878i())).mo60370a();
                                                if (a9 != null) {
                                                    if (da4.f164950c) {
                                                        da4.mo74035c();
                                                        da4.f164950c = false;
                                                    }
                                                    a9.getClass();
                                                    ((cbip) da4.f164949b).f177283a = a9;
                                                }
                                            } else {
                                                LocalEntityId localEntityId4 = a6.f99062r;
                                                if (localEntityId4 == null) {
                                                    bmxv3 = bmvz.f131120a;
                                                    if (!bmxv3.mo66813a()) {
                                                        cbip cbip = (cbip) bmxv3.mo66814b();
                                                        if (cbii.f164950c) {
                                                            cbii.mo74035c();
                                                            cbii.f164950c = false;
                                                        }
                                                        cbip.getClass();
                                                        ((cbij) cbii.f164949b).f177255c = cbip;
                                                        if (TextUtils.equals(a6.mo54713b(), "text/plain")) {
                                                            bxvd da5 = cbiv.f177303b.mo74144da();
                                                            String a10 = azpi.m86066a(a6.mo54712a());
                                                            if (da5.f164950c) {
                                                                da5.mo74035c();
                                                                da5.f164950c = false;
                                                            }
                                                            a10.getClass();
                                                            ((cbiv) da5.f164949b).f177305a = a10;
                                                            cbiv cbiv = (cbiv) da5.mo74062i();
                                                            bxvd = cbil.f177257h.mo74144da();
                                                            if (bxvd.f164950c) {
                                                                bxvd.mo74035c();
                                                                bxvd.f164950c = false;
                                                            }
                                                            ((cbil) bxvd.f164949b).f177261c = cbik.m127887a(3);
                                                            if (bxvd.f164950c) {
                                                                bxvd.mo74035c();
                                                                bxvd.f164950c = false;
                                                            }
                                                            cbil cbil = (cbil) bxvd.f164949b;
                                                            cbiv.getClass();
                                                            cbil.f177260b = cbiv;
                                                            cbil.f177259a = 1;
                                                        } else if (!cfeo.f183719a.mo6606a().mo81081j() || !TextUtils.equals(a6.mo54713b(), "proto/MatchstickMessageContent")) {
                                                            bxvd = null;
                                                        } else {
                                                            cbil cbil2 = (cbil) azol.m85935a((bxxk) cbil.f177257h.mo74142c(7), a6.mo54712a());
                                                            bxvd = (bxvd) cbil2.mo74142c(5);
                                                            bxvd.mo73625a((GeneratedMessageLite) cbil2);
                                                        }
                                                        bmxv b2 = bxvd != null ? bmxv.m108566b(new cbil[]{(cbil) bxvd.mo74062i()}) : bmvz.f131120a;
                                                        if (b2.mo66813a()) {
                                                            cbii.mo75234a(Arrays.asList((cbil[]) b2.mo66814b()));
                                                            ByteString aL = ((cbij) cbii.mo74062i()).mo73639aL();
                                                            if (da.f164950c) {
                                                                da.mo74035c();
                                                                da.f164950c = false;
                                                            }
                                                            aL.getClass();
                                                            ((cbkj) da.f164949b).f177411e = aL;
                                                            bmxv = bmxv.m108566b((cbkj) da.mo74062i());
                                                        } else {
                                                            bmxv = bmvz.f131120a;
                                                        }
                                                    } else {
                                                        bmxv = bmvz.f131120a;
                                                    }
                                                } else {
                                                    cbhu a11 = localEntityId4.mo60370a();
                                                    if (a11 != null) {
                                                        if (da4.f164950c) {
                                                            da4.mo74035c();
                                                            da4.f164950c = false;
                                                        }
                                                        a11.getClass();
                                                        ((cbip) da4.f164949b).f177283a = a11;
                                                    }
                                                }
                                            }
                                            bmxv3 = bmxv.m108566b((cbip) da4.mo74062i());
                                            if (!bmxv3.mo66813a()) {
                                            }
                                        } else {
                                            bmxv = bmvz.f131120a;
                                        }
                                    } else {
                                        azcm = a4;
                                        i = i3;
                                        bmxv = bmvz.f131120a;
                                    }
                                    if (bmxv.mo66813a()) {
                                        j.mo67668c((cbkj) bmxv.mo66814b());
                                    }
                                    if (a5.moveToNext()) {
                                        a4 = azcm;
                                        i3 = i;
                                        z = false;
                                    }
                                }
                            } else {
                                i = i3;
                            }
                            a5.close();
                            bngx = j.mo67664a();
                        } else {
                            i = i3;
                            bngx = j.mo67664a();
                        }
                        if (booleanExtra2 && aznz != null) {
                            azox.m85982b();
                            DatabaseProvider.m94531a(context.getContentResolver(), aznz.f99774a, true);
                            azph.m85998a(context).mo55137a(booleanExtra3 ? 405 : 83, aznz);
                        }
                        new azhu(azef.f99150a, azef.f99156g, i, localEntityId3, aznz, stringExtra7, bngx, localEntityId2).mo54921a();
                    } else {
                        i2 = i3;
                    }
                    bngx = bngx.m109376e();
                    azox.m85982b();
                    DatabaseProvider.m94531a(context.getContentResolver(), aznz.f99774a, true);
                    azph.m85998a(context).mo55137a(booleanExtra3 ? 405 : 83, aznz);
                    new azhu(azef.f99150a, azef.f99156g, i, localEntityId3, aznz, stringExtra7, bngx, localEntityId2).mo54921a();
                }
            }
        } else if (c == 2) {
            String stringExtra8 = intent.getStringExtra("server_app_id");
            if (TextUtils.isEmpty(stringExtra8)) {
                return;
            }
            if (cfec.m138765b()) {
                List d2 = azcv.m85357a(context).mo54702d();
                int size2 = d2.size();
                for (i5++; i5 < size2; i5++) {
                    LocalEntityId localEntityId5 = (LocalEntityId) d2.get(i5);
                    azge.m85618a(localEntityId5, stringExtra8, intent, azef);
                    azph.m85998a(context).mo55143a(260, localEntityId5, stringExtra8);
                }
                return;
            }
            LocalEntityId a12 = azef.mo54824a();
            azge.m85618a(a12, stringExtra8, intent, azef);
            azph.m85998a(context).mo55143a(260, a12, stringExtra8);
        } else if (c == 3) {
            String stringExtra9 = intent.getStringExtra("server_app_id");
            if (!TextUtils.isEmpty(stringExtra9)) {
                azfo.m85593a(context);
                Intent b3 = azfo.m85594b(intent);
                if (cfec.m138765b()) {
                    List d3 = azcv.m85357a(context).mo54702d();
                    int size3 = d3.size();
                    for (i4++; i4 < size3; i4++) {
                        azge.m85617a((LocalEntityId) d3.get(i4), stringExtra9, intent, b3, azef);
                    }
                    return;
                }
                azge.m85617a(azef.mo54824a(), stringExtra9, intent, b3, azef);
            }
        } else if (c == 4) {
            if (cfec.m138765b()) {
                List d4 = azcv.m85357a(context).mo54702d();
                int size4 = d4.size();
                for (int i7 = 0; i7 < size4; i7++) {
                    LocalEntityId localEntityId6 = (LocalEntityId) d4.get(i7);
                    new Object[1][0] = localEntityId6;
                    azef.mo54826a(localEntityId6);
                }
                return;
            }
            LocalEntityId a13 = azef.mo54824a();
            new Object[1][0] = a13;
            azef.mo54826a(a13);
        }
    }
}
