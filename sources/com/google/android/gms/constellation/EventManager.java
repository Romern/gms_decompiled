package com.google.android.gms.constellation;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.chimera.IntentOperation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EventManager extends IntentOperation {

    /* renamed from: b */
    private static final sek f30464b = tea.m36798a("event_manager");

    /* renamed from: a */
    syf f30465a = null;

    /* renamed from: c */
    private syc f30466c = null;

    /* renamed from: d */
    private boolean f30467d = false;

    /* renamed from: e */
    private Exception f30468e;

    /* renamed from: f */
    private szq f30469f;

    /* renamed from: a */
    private final String m22778a(Intent intent, tdx tdx) {
        String str;
        String action = intent.getAction();
        boolean booleanExtra = intent.getBooleanExtra("eventmanager.force_refresh", false);
        try {
            str = intent.getStringExtra("iid_token");
        } catch (BadParcelableException e) {
            f30464b.mo25417e("BadparcelableException for iid token key: ", e, new Object[0]);
            str = null;
        }
        if (intent.getBooleanExtra("eventmanager.generate_iid_token", false) || m22782a(action)) {
            if (TextUtils.isEmpty(str)) {
                if (!booleanExtra) {
                    String c = m22785c();
                    if (TextUtils.isEmpty(c)) {
                        c = this.f30469f.f45525b.getString("gcm_token", null);
                    }
                    str = c;
                } else {
                    str = m22785c();
                }
            }
            tdx.f45712e = str;
        }
        return str;
    }

    /* renamed from: b */
    private final ArrayList m22783b(Intent intent, tdx tdx) {
        String action = intent.getAction();
        boolean booleanExtra = intent.getBooleanExtra("eventmanager.generate_gaia_tokens", false);
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            arrayList = intent.getStringArrayListExtra("gaia_tokens");
        } catch (BadParcelableException e) {
            f30464b.mo25417e("BadparcelableException for gaia tokens key: ", e, new Object[0]);
        }
        if (booleanExtra || m22782a(action)) {
            if (arrayList == null || arrayList.isEmpty()) {
                arrayList = new ArrayList<>();
                tdk.m36757a();
                arrayList.addAll(tdk.m36756a(tdx, cdfq.m133002b(), getBaseContext(), new Bundle()).values());
            }
            tdx.f45713f = arrayList;
        }
        return arrayList;
    }

    /* renamed from: c */
    private final String m22785c() {
        try {
            String a = addi.m50206a(getApplicationContext()).mo33343a(cdfq.m133003c(), "GCM");
            SharedPreferences.Editor edit = this.f30469f.f45525b.edit();
            edit.putString("gcm_token", a);
            edit.apply();
            return a;
        } catch (IOException e) {
            f30464b.mo25417e("Couldn't get GCM token", e, new Object[0]);
            this.f30468e = e;
            this.f30467d = true;
            return null;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03d6, code lost:
        r10.mo26234a(r13, r2, r3);
        m22780a(r8, 1, (android.os.Bundle) null);
     */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x06f6 A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x070d A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x072b A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x072c A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0747 A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0748 A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0764 A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0765 A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x078b A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x078c A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x07ae A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x07af A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x07cd A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x07ce A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x07e7 A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x07e8 A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x081b A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x081c A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x082f A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0830 A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x084b A[Catch:{ tdw -> 0x0987 }] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x084c A[Catch:{ tdw -> 0x0987 }] */
    public final void onHandleIntent(Intent intent) {
        String str;
        ResultReceiver resultReceiver;
        tdx tdx;
        char c;
        String str2;
        ResultReceiver resultReceiver2;
        Bundle bundle;
        tdw tdw;
        Bundle bundle2;
        ResultReceiver resultReceiver3;
        HashMap hashMap;
        List list;
        tdx tdx2;
        String str3;
        ArrayList arrayList;
        tdx tdx3;
        cbre cbre;
        Map map;
        ArrayList arrayList2;
        tes tes;
        cbqw cbqw;
        bxvd da;
        bxvd da2;
        bxvd da3;
        cboc cboc;
        bxvd da4;
        ArrayList arrayList3;
        Map map2;
        cbqn cbqn;
        cbqn cbqn2;
        cbqn cbqn3;
        cbqn cbqn4;
        String str4;
        EventManager eventManager = this;
        Intent intent2 = intent;
        String action = intent.getAction();
        eventManager.f30469f = szq.m36667a(getBaseContext());
        int i = 0;
        try {
            str = intent2.getStringExtra("eventmanager.session_id");
        } catch (BadParcelableException e) {
            f30464b.mo25417e("BadparcelableException for UUID: ", e, new Object[0]);
            str = null;
        }
        try {
            resultReceiver = (ResultReceiver) intent2.getParcelableExtra("eventmanager.on_sync_complete_callback_key");
        } catch (BadParcelableException e2) {
            f30464b.mo25417e("BadparcelableException for resultReceiver: ", e2, new Object[0]);
            resultReceiver = null;
        }
        tdj tdj = new tdj();
        tds a = tds.m36774a(this);
        if (TextUtils.isEmpty(str)) {
            tdx tdx4 = new tdx(UUID.randomUUID().toString(), tdj);
            a.mo26406a(tdx4, 41);
            tdx = tdx4;
        } else {
            tdx = new tdx(str, tdj);
        }
        if (resultReceiver == null) {
            a.mo26406a(tdx, 44);
        }
        if ("com.google.android.gms.constellation.eventmanager.GENERATE_TOKENS".equals(action) || m22782a(action)) {
            String a2 = eventManager.m22778a(intent2, tdx);
            ArrayList b = eventManager.m22783b(intent2, tdx);
            if (!m22782a(action)) {
                Bundle bundle3 = new Bundle();
                if (!b.isEmpty()) {
                    bundle3.putStringArrayList("gaia_tokens", b);
                }
                if (!TextUtils.isEmpty(a2)) {
                    bundle3.putString("iid_token", a2);
                }
                m22780a(resultReceiver, 3, bundle3);
                return;
            }
            eventManager.f30466c = syc.m36573a();
            if (!TextUtils.isEmpty(tdx.f45712e)) {
                eventManager.f30465a = new syf(getApplicationContext());
            }
            tdx.f45711d = intent2.getIntExtra("eventmanager.trigger_type", 0);
            f30464b.mo25414c("Starting session. sessionId: %s from trigger: %s", tdx.f45708a, Integer.valueOf(tdx.f45711d));
            tds a3 = tds.m36774a(getBaseContext());
            syf syf = eventManager.f30465a;
            if (syf != null) {
                switch (action.hashCode()) {
                    case -1228157273:
                        if (action.equals("com.google.android.gms.constellation.eventmanager.SYNC_VERIFICATION")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 140032422:
                        if (action.equals("com.google.android.gms.constellation.eventmanager.SYNC_VERIFICATION_IF_STATE_MISMATCH")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 996529700:
                        if (action.equals("com.google.android.gms.constellation.eventmanager.SET_ASTERISM_CONSENT")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1607453104:
                        if (action.equals("com.google.android.gms.constellation.eventmanager.GET_ASTERISM_CONSENT")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    String str5 = "failure_verification_exception_key";
                    Bundle bundle4 = new Bundle();
                    try {
                        Bundle bundleExtra = intent2.getBundleExtra("eventmanager.extra_param");
                        if (intent2.hasExtra("eventmanager.max_verification_age_key")) {
                            try {
                                String stringExtra = intent2.getStringExtra("eventmanager.policy_id_key");
                                long longExtra = intent2.getLongExtra("eventmanager.max_verification_age_key", -1);
                                String stringExtra2 = intent2.getStringExtra("eventmanager.certificate_hash_key");
                                String stringExtra3 = intent2.getStringExtra("eventmanager.token_nonce_key");
                                String stringExtra4 = intent2.getStringExtra("eventmanager.calling_package_key");
                                syf syf2 = eventManager.f30465a;
                                syf2.mo26238a();
                                List a4 = tec.m36805a(syf2.f45420b, tdx).mo26418a(tdx, syf2.f45420b);
                                new ArrayList();
                                List a5 = syf.m36577a(bundleExtra);
                                str2 = str5;
                                try {
                                    ArrayList arrayList4 = new ArrayList();
                                    if (a4.isEmpty()) {
                                        arrayList = arrayList4;
                                        list = a5;
                                        resultReceiver3 = resultReceiver;
                                        bundle2 = bundle4;
                                        tdx2 = tdx;
                                        str3 = stringExtra4;
                                    } else {
                                        resultReceiver3 = resultReceiver;
                                        try {
                                            bundle2 = bundle4;
                                        } catch (tdw e3) {
                                            eventManager = this;
                                            tdw = e3;
                                            bundle = bundle4;
                                            resultReceiver2 = resultReceiver3;
                                            bundle.putSerializable(str2, tdw);
                                            m22780a(resultReceiver2, 0, bundle);
                                            eventManager.m22781a(tdw);
                                        }
                                        try {
                                            Map b2 = tec.m36805a(syf2.f45420b, tdx).mo26420b(tdx, syf2.f45420b);
                                            Map a6 = tec.m36805a(syf2.f45420b, tdx).mo26419a();
                                            Map a7 = tdg.m36749a().mo26395a(tdx);
                                            list = a5;
                                            ArrayList arrayList5 = new ArrayList();
                                            ArrayList arrayList6 = arrayList4;
                                            Iterator it = tdx.f45713f.iterator();
                                            while (it.hasNext()) {
                                                Iterator it2 = it;
                                                String str6 = (String) it.next();
                                                tdx tdx5 = tdx;
                                                bxvd da5 = cbpw.f177965b.mo74144da();
                                                String str7 = stringExtra3;
                                                if (da5.f164950c) {
                                                    da5.mo74035c();
                                                    da5.f164950c = false;
                                                }
                                                str6.getClass();
                                                ((cbpw) da5.f164949b).f177967a = str6;
                                                arrayList5.add((cbpw) da5.mo74062i());
                                                stringExtra3 = str7;
                                                it = it2;
                                                tdx = tdx5;
                                            }
                                            String str8 = stringExtra3;
                                            tdx2 = tdx;
                                            Iterator it3 = a4.iterator();
                                            while (it3.hasNext()) {
                                                Pair pair = (Pair) it3.next();
                                                if (pair.first != null) {
                                                    sek sek = syf2.f45419a;
                                                    Iterator it4 = it3;
                                                    String str9 = stringExtra2;
                                                    String valueOf = String.valueOf((String) pair.first);
                                                    String str10 = stringExtra4;
                                                    sek.mo25409a(valueOf.length() == 0 ? new String("observed a imsi ") : "observed a imsi ".concat(valueOf), new Object[0]);
                                                    String str11 = (String) pair.first;
                                                    String str12 = (String) pair.second;
                                                    cbqo cbqo = (cbqo) cbqp.f178048c.mo74144da();
                                                    cbqo.mo75242a(str11);
                                                    if (str12 != null) {
                                                        if (cbqo.f164950c) {
                                                            cbqo.mo74035c();
                                                            cbqo.f164950c = false;
                                                        }
                                                        str12.getClass();
                                                        ((cbqp) cbqo.f164949b).f178051b = str12;
                                                    }
                                                    cbqm cbqm = (cbqm) cbqn.f178043d.mo74144da();
                                                    if (cbqm.f164950c) {
                                                        cbqm.mo74035c();
                                                        cbqm.f164950c = false;
                                                    }
                                                    cbqp cbqp = (cbqp) cbqo.mo74062i();
                                                    cbqp.getClass();
                                                    ((cbqn) cbqm.f164949b).f178045a = cbqp;
                                                    cbqm.mo75241a(arrayList5);
                                                    if (b2.containsKey(str11)) {
                                                        cbrh cbrh = (cbrh) b2.get(str11);
                                                        bxvd bxvd = (bxvd) cbrh.mo74142c(5);
                                                        bxvd.mo73625a((bxvk) cbrh);
                                                        cbre = (cbre) bxvd;
                                                    } else {
                                                        cbre = null;
                                                    }
                                                    if (a6 == null) {
                                                        arrayList3 = arrayList5;
                                                        map2 = b2;
                                                    } else if (a6.containsKey(str11)) {
                                                        int intValue = ((Integer) a6.get(str11)).intValue();
                                                        if (!cdfw.m133049d()) {
                                                            bxvd da6 = cbqq.f178052b.mo74144da();
                                                            arrayList2 = arrayList5;
                                                            if (da6.f164950c) {
                                                                da6.mo74035c();
                                                                da6.f164950c = false;
                                                            }
                                                            map = b2;
                                                            ((cbqq) da6.f164949b).f178054a = -1;
                                                            if (cbqm.f164950c) {
                                                                cbqm.mo74035c();
                                                                cbqm.f164950c = false;
                                                            }
                                                            cbqq cbqq = (cbqq) da6.mo74062i();
                                                            cbqq.getClass();
                                                            ((cbqn) cbqm.f164949b).f178046b = cbqq;
                                                        } else {
                                                            arrayList2 = arrayList5;
                                                            map = b2;
                                                            int i2 = Build.VERSION.SDK_INT;
                                                            bxvd da7 = cbqq.f178052b.mo74144da();
                                                            int slotIndex = SubscriptionManager.getSlotIndex(intValue);
                                                            if (da7.f164950c) {
                                                                da7.mo74035c();
                                                                da7.f164950c = false;
                                                            }
                                                            ((cbqq) da7.f164949b).f178054a = slotIndex;
                                                            if (cbqm.f164950c) {
                                                                cbqm.mo74035c();
                                                                cbqm.f164950c = false;
                                                            }
                                                            cbqq cbqq2 = (cbqq) da7.mo74062i();
                                                            cbqq2.getClass();
                                                            ((cbqn) cbqm.f164949b).f178046b = cbqq2;
                                                        }
                                                        if (cbre != null && cdfn.m132939b()) {
                                                            if (cbre.f164950c) {
                                                                cbre.mo74035c();
                                                                cbre.f164950c = false;
                                                            }
                                                            cbrh cbrh2 = cbrh.f178114t;
                                                            ((cbrh) cbre.f164949b).f178131p = bxvk.m124030de();
                                                            szr szr = syf2.f45423e;
                                                            cbre.mo75247b(szr.m36691a(intValue));
                                                        }
                                                        if (cbre != null && cdfn.m132940c()) {
                                                            if (cbre.f164950c) {
                                                                cbre.mo74035c();
                                                                cbre.f164950c = false;
                                                            }
                                                            cbrh cbrh3 = cbrh.f178114t;
                                                            ((cbrh) cbre.f164949b).f178134s = bxvk.m124030de();
                                                            szr szr2 = syf2.f45423e;
                                                            cbre.mo75248c(szr.m36697b(intValue));
                                                        }
                                                        if (cbre != null) {
                                                            Integer valueOf2 = Integer.valueOf(intValue);
                                                            if (a7.containsKey(valueOf2)) {
                                                                if (cbre.f164950c) {
                                                                    cbre.mo74035c();
                                                                    cbre.f164950c = false;
                                                                }
                                                                cbrh cbrh4 = cbrh.f178114t;
                                                                ((cbrh) cbre.f164949b).f178133r = bxvk.m124030de();
                                                                cbre.mo75249d((Iterable) ((Pair) a7.get(valueOf2)).first);
                                                                if (cbre.f164950c) {
                                                                    cbre.mo74035c();
                                                                    cbre.f164950c = false;
                                                                }
                                                                ((cbrh) cbre.f164949b).f178132q = bxvk.m124030de();
                                                                cbre.mo75246a((Iterable) ((Pair) a7.get(valueOf2)).second);
                                                            }
                                                        }
                                                        tes = syf2.mo26237a(intValue, a4.size());
                                                        syf2.f45424f.put(str11, tes);
                                                        int i3 = Build.VERSION.SDK_INT;
                                                        if (cdgc.m133123d()) {
                                                            syf2.f45425g.put(str11, syf2.mo26236a(a4.size()));
                                                        }
                                                        cbqw = (cbqw) cbqy.f178081i.mo74144da();
                                                        if (cbre != null) {
                                                            if (cbqw.f164950c) {
                                                                cbqw.mo74035c();
                                                                cbqw.f164950c = false;
                                                            }
                                                            cbrh cbrh5 = (cbrh) cbre.mo74062i();
                                                            cbrh5.getClass();
                                                            ((cbqy) cbqw.f164949b).f178087e = cbrh5;
                                                        }
                                                        if (!cbqw.f164950c) {
                                                            cbqw.mo74035c();
                                                            cbqw.f164950c = false;
                                                        }
                                                        ((cbqy) cbqw.f164949b).f178086d = cbqx.m128115a(3);
                                                        da = cbqz.f178091c.mo74144da();
                                                        if (!da.f164950c) {
                                                            da.mo74035c();
                                                            da.f164950c = false;
                                                        }
                                                        cbqz cbqz = (cbqz) da.f164949b;
                                                        cbqn cbqn5 = (cbqn) cbqm.mo74062i();
                                                        cbqn5.getClass();
                                                        cbqz.f178094b = cbqn5;
                                                        cbqz.f178093a = 1;
                                                        if (!cbqw.f164950c) {
                                                            cbqw.mo74035c();
                                                            cbqw.f164950c = false;
                                                        }
                                                        cbqz cbqz2 = (cbqz) da.mo74062i();
                                                        cbqz2.getClass();
                                                        ((cbqy) cbqw.f164949b).f178085c = cbqz2;
                                                        cbqw.mo75244a(syf.m36577a(bundleExtra));
                                                        da2 = cbqt.f178065e.mo74144da();
                                                        if (!da2.f164950c) {
                                                            da2.mo74035c();
                                                            da2.f164950c = false;
                                                        }
                                                        cbqt cbqt = (cbqt) da2.f164949b;
                                                        stringExtra.getClass();
                                                        cbqt.f178067a = stringExtra;
                                                        cbqt.f178068b = longExtra;
                                                        str10.getClass();
                                                        String str13 = str10;
                                                        cbqt.f178070d = str13;
                                                        da3 = cbqc.f178002c.mo74144da();
                                                        if (!da3.f164950c) {
                                                            da3.mo74035c();
                                                            da3.f164950c = false;
                                                        }
                                                        cbqc cbqc = (cbqc) da3.f164949b;
                                                        str9.getClass();
                                                        String str14 = str9;
                                                        cbqc.f178004a = str14;
                                                        str8.getClass();
                                                        Map map3 = a7;
                                                        String str15 = str8;
                                                        cbqc.f178005b = str15;
                                                        if (!da2.f164950c) {
                                                            da2.mo74035c();
                                                            da2.f164950c = false;
                                                        }
                                                        cbqc cbqc2 = (cbqc) da3.mo74062i();
                                                        cbqc2.getClass();
                                                        ((cbqt) da2.f164949b).f178069c = cbqc2;
                                                        if (!cbqw.f164950c) {
                                                            cbqw.mo74035c();
                                                            cbqw.f164950c = false;
                                                        }
                                                        cbqt cbqt2 = (cbqt) da2.mo74062i();
                                                        cbqt2.getClass();
                                                        ((cbqy) cbqw.f164949b).f178089g = cbqt2;
                                                        cbod b3 = syf.m36578b();
                                                        bxvd bxvd2 = (bxvd) b3.mo74142c(5);
                                                        bxvd2.mo73625a((bxvk) b3);
                                                        cboc = (cboc) bxvd2;
                                                        da4 = cbon.f177839b.mo74144da();
                                                        String a8 = tes.mo26445a();
                                                        if (!da4.f164950c) {
                                                            da4.mo74035c();
                                                            da4.f164950c = false;
                                                        }
                                                        a8.getClass();
                                                        ((cbon) da4.f164949b).f177841a = a8;
                                                        if (!cboc.f164950c) {
                                                            cboc.mo74035c();
                                                            cboc.f164950c = false;
                                                        }
                                                        cbon cbon = (cbon) da4.mo74062i();
                                                        cbod cbod = cbod.f177801d;
                                                        cbon.getClass();
                                                        ((cbod) cboc.f164949b).f177804b = cbon;
                                                        if (!cbqw.f164950c) {
                                                            cbqw.mo74035c();
                                                            cbqw.f164950c = false;
                                                        }
                                                        cbod cbod2 = (cbod) cboc.mo74062i();
                                                        cbod2.getClass();
                                                        ((cbqy) cbqw.f164949b).f178090h = cbod2;
                                                        arrayList6.add((cbqy) cbqw.mo74062i());
                                                        str8 = str15;
                                                        arrayList6 = arrayList6;
                                                        stringExtra4 = str13;
                                                        stringExtra2 = str14;
                                                        it3 = it4;
                                                        a7 = map3;
                                                        arrayList5 = arrayList2;
                                                        b2 = map;
                                                    } else {
                                                        arrayList3 = arrayList5;
                                                        map2 = b2;
                                                    }
                                                    tes = new tep(syf2.f45420b);
                                                    bxvd da8 = cbqq.f178052b.mo74144da();
                                                    if (da8.f164950c) {
                                                        da8.mo74035c();
                                                        da8.f164950c = false;
                                                    }
                                                    ((cbqq) da8.f164949b).f178054a = -1;
                                                    if (cbqm.f164950c) {
                                                        cbqm.mo74035c();
                                                        cbqm.f164950c = false;
                                                    }
                                                    cbqq cbqq3 = (cbqq) da8.mo74062i();
                                                    cbqq3.getClass();
                                                    ((cbqn) cbqm.f164949b).f178046b = cbqq3;
                                                    syf2.f45424f.put(str11, tes);
                                                    int i32 = Build.VERSION.SDK_INT;
                                                    if (cdgc.m133123d()) {
                                                    }
                                                    cbqw = (cbqw) cbqy.f178081i.mo74144da();
                                                    if (cbre != null) {
                                                    }
                                                    if (!cbqw.f164950c) {
                                                    }
                                                    ((cbqy) cbqw.f164949b).f178086d = cbqx.m128115a(3);
                                                    da = cbqz.f178091c.mo74144da();
                                                    if (!da.f164950c) {
                                                    }
                                                    cbqz cbqz3 = (cbqz) da.f164949b;
                                                    cbqn cbqn52 = (cbqn) cbqm.mo74062i();
                                                    cbqn52.getClass();
                                                    cbqz3.f178094b = cbqn52;
                                                    cbqz3.f178093a = 1;
                                                    if (!cbqw.f164950c) {
                                                    }
                                                    cbqz cbqz22 = (cbqz) da.mo74062i();
                                                    cbqz22.getClass();
                                                    ((cbqy) cbqw.f164949b).f178085c = cbqz22;
                                                    cbqw.mo75244a(syf.m36577a(bundleExtra));
                                                    da2 = cbqt.f178065e.mo74144da();
                                                    if (!da2.f164950c) {
                                                    }
                                                    cbqt cbqt3 = (cbqt) da2.f164949b;
                                                    stringExtra.getClass();
                                                    cbqt3.f178067a = stringExtra;
                                                    cbqt3.f178068b = longExtra;
                                                    str10.getClass();
                                                    String str132 = str10;
                                                    cbqt3.f178070d = str132;
                                                    da3 = cbqc.f178002c.mo74144da();
                                                    if (!da3.f164950c) {
                                                    }
                                                    cbqc cbqc3 = (cbqc) da3.f164949b;
                                                    str9.getClass();
                                                    String str142 = str9;
                                                    cbqc3.f178004a = str142;
                                                    str8.getClass();
                                                    Map map32 = a7;
                                                    String str152 = str8;
                                                    cbqc3.f178005b = str152;
                                                    if (!da2.f164950c) {
                                                    }
                                                    cbqc cbqc22 = (cbqc) da3.mo74062i();
                                                    cbqc22.getClass();
                                                    ((cbqt) da2.f164949b).f178069c = cbqc22;
                                                    if (!cbqw.f164950c) {
                                                    }
                                                    cbqt cbqt22 = (cbqt) da2.mo74062i();
                                                    cbqt22.getClass();
                                                    ((cbqy) cbqw.f164949b).f178089g = cbqt22;
                                                    cbod b32 = syf.m36578b();
                                                    bxvd bxvd22 = (bxvd) b32.mo74142c(5);
                                                    bxvd22.mo73625a((bxvk) b32);
                                                    cboc = (cboc) bxvd22;
                                                    da4 = cbon.f177839b.mo74144da();
                                                    String a82 = tes.mo26445a();
                                                    if (!da4.f164950c) {
                                                    }
                                                    a82.getClass();
                                                    ((cbon) da4.f164949b).f177841a = a82;
                                                    if (!cboc.f164950c) {
                                                    }
                                                    cbon cbon2 = (cbon) da4.mo74062i();
                                                    cbod cbod3 = cbod.f177801d;
                                                    cbon2.getClass();
                                                    ((cbod) cboc.f164949b).f177804b = cbon2;
                                                    if (!cbqw.f164950c) {
                                                    }
                                                    cbod cbod22 = (cbod) cboc.mo74062i();
                                                    cbod22.getClass();
                                                    ((cbqy) cbqw.f164949b).f178090h = cbod22;
                                                    arrayList6.add((cbqy) cbqw.mo74062i());
                                                    str8 = str152;
                                                    arrayList6 = arrayList6;
                                                    stringExtra4 = str132;
                                                    stringExtra2 = str142;
                                                    it3 = it4;
                                                    a7 = map32;
                                                    arrayList5 = arrayList2;
                                                    b2 = map;
                                                } else {
                                                    stringExtra2 = stringExtra2;
                                                    a7 = a7;
                                                    b2 = b2;
                                                }
                                            }
                                            str3 = stringExtra4;
                                            arrayList = arrayList6;
                                        } catch (tdw e4) {
                                            eventManager = this;
                                            tdw = e4;
                                            resultReceiver2 = resultReceiver3;
                                            bundle = bundle2;
                                            bundle.putSerializable(str2, tdw);
                                            m22780a(resultReceiver2, 0, bundle);
                                            eventManager.m22781a(tdw);
                                        }
                                    }
                                    syf2.f45422d.mo26263a();
                                    sza sza = syf2.f45421c;
                                    List list2 = list;
                                    if (sza.m36625a(list2, "one_time_verification").equals("True")) {
                                        tdx3 = tdx2;
                                    } else {
                                        cbnw cbnw = cbnw.UNKNOWN_CLIENT;
                                        cbpx cbpx = (cbpx) cbpy.f177968h.mo74144da();
                                        tdx3 = tdx2;
                                        cbqj a9 = sza.mo26252a(tdx3, false, cdfq.m133004d(), "getConsent");
                                        if (cbpx.f164950c) {
                                            cbpx.mo74035c();
                                            cbpx.f164950c = false;
                                        }
                                        cbpy cbpy = (cbpy) cbpx.f164949b;
                                        a9.getClass();
                                        cbpy.f177970a = a9;
                                        cbpy.f177975f = cbnw.mo3214a();
                                        if (!TextUtils.isEmpty(tdx3.f45712e)) {
                                            bxvd da9 = cbpq.f177946b.mo74144da();
                                            String str16 = tdx3.f45712e;
                                            if (da9.f164950c) {
                                                da9.mo74035c();
                                                da9.f164950c = false;
                                            }
                                            str16.getClass();
                                            ((cbpq) da9.f164949b).f177948a = str16;
                                            if (cbpx.f164950c) {
                                                cbpx.mo74035c();
                                                cbpx.f164950c = false;
                                            }
                                            cbpq cbpq = (cbpq) da9.mo74062i();
                                            cbpq.getClass();
                                            ((cbpy) cbpx.f164949b).f177971b = cbpq;
                                        }
                                        if (!list2.isEmpty()) {
                                            cbpx.mo75240a(list2);
                                        }
                                        bxvd da10 = cbqt.f178065e.mo74144da();
                                        if (da10.f164950c) {
                                            da10.mo74035c();
                                            da10.f164950c = false;
                                        }
                                        cbqt cbqt4 = (cbqt) da10.f164949b;
                                        stringExtra.getClass();
                                        cbqt4.f178067a = stringExtra;
                                        str3.getClass();
                                        cbqt4.f178070d = str3;
                                        if (cbpx.f164950c) {
                                            cbpx.mo74035c();
                                            cbpx.f164950c = false;
                                        }
                                        cbqt cbqt5 = (cbqt) da10.mo74062i();
                                        cbqt5.getClass();
                                        ((cbpy) cbpx.f164949b).f177974e = cbqt5;
                                        if (!sza.mo26259a(tdx3, cbpx)) {
                                            syf2.f45419a.mo25414c("Device is not consented", new Object[0]);
                                            throw new tdt();
                                        }
                                    }
                                    hashMap = syf2.mo26233a(syf2.mo26235a(tdx3, syf2.mo26239b(tdx3, arrayList)));
                                    eventManager = this;
                                } catch (tdw e5) {
                                    e = e5;
                                    eventManager = this;
                                    tdw = e;
                                    resultReceiver2 = resultReceiver;
                                    bundle = bundle4;
                                    bundle.putSerializable(str2, tdw);
                                    m22780a(resultReceiver2, 0, bundle);
                                    eventManager.m22781a(tdw);
                                }
                            } catch (tdw e6) {
                                e = e6;
                                str2 = str5;
                                eventManager = this;
                                tdw = e;
                                resultReceiver2 = resultReceiver;
                                bundle = bundle4;
                                bundle.putSerializable(str2, tdw);
                                m22780a(resultReceiver2, 0, bundle);
                                eventManager.m22781a(tdw);
                            }
                        } else {
                            str2 = str5;
                            resultReceiver3 = resultReceiver;
                            bundle2 = bundle4;
                            tdx tdx6 = tdx;
                            eventManager = this;
                            try {
                                syf syf3 = eventManager.f30465a;
                                syf3.mo26238a();
                                hashMap = syf3.mo26233a(syf3.mo26234a(tdx6, bundleExtra, tec.m36805a(syf3.f45420b, tdx6).mo26418a(tdx6, syf3.f45420b)));
                            } catch (tdw e7) {
                                e = e7;
                                resultReceiver2 = resultReceiver3;
                                bundle = bundle2;
                                tdw = e;
                                bundle.putSerializable(str2, tdw);
                                m22780a(resultReceiver2, 0, bundle);
                                eventManager.m22781a(tdw);
                            }
                        }
                        bundle = bundle2;
                        try {
                            bundle.putSerializable("success_server_result_data_key", hashMap);
                            resultReceiver2 = resultReceiver3;
                            try {
                                m22780a(resultReceiver2, 1, bundle);
                                m22779a();
                            } catch (tdw e8) {
                                e = e8;
                                tdw = e;
                                bundle.putSerializable(str2, tdw);
                                m22780a(resultReceiver2, 0, bundle);
                                eventManager.m22781a(tdw);
                            }
                        } catch (tdw e9) {
                            e = e9;
                            resultReceiver2 = resultReceiver3;
                            tdw = e;
                            bundle.putSerializable(str2, tdw);
                            m22780a(resultReceiver2, 0, bundle);
                            eventManager.m22781a(tdw);
                        }
                    } catch (tdw e10) {
                        e = e10;
                        str2 = str5;
                        resultReceiver2 = resultReceiver;
                        bundle = bundle4;
                        tdw = e;
                        bundle.putSerializable(str2, tdw);
                        m22780a(resultReceiver2, 0, bundle);
                        eventManager.m22781a(tdw);
                    }
                } else if (c == 1) {
                    String str17 = "failure_verification_exception_key";
                    try {
                        Bundle bundle5 = Bundle.EMPTY;
                        syf.mo26238a();
                        List<Pair> a10 = tec.m36805a(syf.f45420b, tdx).mo26418a(tdx, syf.f45420b);
                        List<cbqy> d = szr.m36699d();
                        ArrayList arrayList7 = new ArrayList();
                        for (Pair pair2 : a10) {
                            arrayList7.add((String) pair2.first);
                        }
                        HashSet hashSet = new HashSet();
                        for (cbqy cbqy : d) {
                            cbqz cbqz4 = cbqy.f178085c;
                            if (cbqz4 == null) {
                                cbqz4 = cbqz.f178091c;
                            }
                            if (cbqz4.f178093a == 1) {
                                cbqn4 = (cbqn) cbqz4.f178094b;
                            } else {
                                cbqn4 = cbqn.f178043d;
                            }
                            cbqp cbqp2 = cbqn4.f178045a;
                            if (cbqp2 == null) {
                                cbqp2 = cbqp.f178048c;
                            }
                            hashSet.addAll(cbqp2.f178050a);
                        }
                        Iterator it5 = arrayList7.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                String str18 = (String) it5.next();
                                if (!hashSet.contains(str18)) {
                                    sek sek2 = syf.f45419a;
                                    String valueOf3 = String.valueOf(str18);
                                    sek2.mo25409a(valueOf3.length() == 0 ? new String("observed an imsi not in existing verifications: ") : "observed an imsi not in existing verifications: ".concat(valueOf3), new Object[0]);
                                    tds.m36774a(syf.f45420b).mo26406a(tdx, 37);
                                }
                            } else {
                                Iterator it6 = d.iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        ArrayList<String> arrayList8 = new ArrayList();
                                        for (Pair pair3 : a10) {
                                            if (!TextUtils.isEmpty((CharSequence) pair3.second)) {
                                                arrayList8.add((String) pair3.second);
                                            }
                                        }
                                        HashSet hashSet2 = new HashSet();
                                        Iterator it7 = d.iterator();
                                        while (true) {
                                            if (it7.hasNext()) {
                                                cbqz cbqz5 = ((cbqy) it7.next()).f178085c;
                                                if (cbqz5 == null) {
                                                    cbqz5 = cbqz.f178091c;
                                                }
                                                if (cbqz5.f178093a == 1) {
                                                    cbqn = (cbqn) cbqz5.f178094b;
                                                } else {
                                                    cbqn = cbqn.f178043d;
                                                }
                                                cbqp cbqp3 = cbqn.f178045a;
                                                if (cbqp3 == null) {
                                                    cbqp3 = cbqp.f178048c;
                                                }
                                                String str19 = cbqp3.f178051b;
                                                if (!TextUtils.isEmpty(str19)) {
                                                    if (!arrayList8.contains(str19)) {
                                                        sek sek3 = syf.f45419a;
                                                        String valueOf4 = String.valueOf(str19);
                                                        sek3.mo25409a(valueOf4.length() == 0 ? new String("a verified number not observed in device: ") : "a verified number not observed in device: ".concat(valueOf4), new Object[i]);
                                                        tds.m36774a(syf.f45420b).mo26406a(tdx, 40);
                                                    } else {
                                                        String[] strArr = new String[1];
                                                        strArr[i] = str19;
                                                        Collections.addAll(hashSet2, strArr);
                                                    }
                                                }
                                            } else {
                                                for (String str20 : arrayList8) {
                                                    if (!hashSet2.contains(str20)) {
                                                        sek sek4 = syf.f45419a;
                                                        String valueOf5 = String.valueOf(str20);
                                                        sek4.mo25409a(valueOf5.length() == 0 ? new String("observed an imsi not in existing verifications: ") : "observed an imsi not in existing verifications: ".concat(valueOf5), new Object[i]);
                                                        tds.m36774a(syf.f45420b).mo26406a(tdx, 39);
                                                    }
                                                }
                                                syf.f45419a.mo25414c("Sync is not required", new Object[i]);
                                                m22780a(resultReceiver, 2, (Bundle) null);
                                            }
                                        }
                                    } else {
                                        cbqy cbqy2 = (cbqy) it6.next();
                                        cbqz cbqz6 = cbqy2.f178085c;
                                        if (cbqz6 == null) {
                                            cbqz6 = cbqz.f178091c;
                                        }
                                        if (cbqz6.f178093a == 1) {
                                            cbqn2 = (cbqn) cbqz6.f178094b;
                                        } else {
                                            cbqn2 = cbqn.f178043d;
                                        }
                                        cbqp cbqp4 = cbqn2.f178045a;
                                        if (cbqp4 == null) {
                                            cbqp4 = cbqp.f178048c;
                                        }
                                        for (String str21 : cbqp4.f178050a) {
                                            if (arrayList7.contains(str21)) {
                                                i = 0;
                                            }
                                        }
                                        sek sek5 = syf.f45419a;
                                        cbqz cbqz7 = cbqy2.f178085c;
                                        if (cbqz7 == null) {
                                            cbqz7 = cbqz.f178091c;
                                        }
                                        if (cbqz7.f178093a == 1) {
                                            cbqn3 = (cbqn) cbqz7.f178094b;
                                        } else {
                                            cbqn3 = cbqn.f178043d;
                                        }
                                        cbqp cbqp5 = cbqn3.f178045a;
                                        if (cbqp5 == null) {
                                            cbqp5 = cbqp.f178048c;
                                        }
                                        String valueOf6 = String.valueOf(cbqp5.f178050a);
                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf6).length() + 49);
                                        sb.append("Did not find matching imsi for the verification: ");
                                        sb.append(valueOf6);
                                        sek5.mo25409a(sb.toString(), new Object[0]);
                                        tds.m36774a(syf.f45420b).mo26406a(tdx, 38);
                                    }
                                }
                            }
                        }
                        m22779a();
                    } catch (tdw e11) {
                        Bundle bundle6 = new Bundle();
                        bundle6.putSerializable(str17, e11);
                        m22780a(resultReceiver, 0, bundle6);
                        eventManager.m22781a(e11);
                    }
                } else if (c == 2) {
                    String str22 = "failure_verification_exception_key";
                    Bundle bundle7 = new Bundle();
                    try {
                        bundle7.putSerializable("success_consent_value_key", Boolean.valueOf(eventManager.f30465a.f45421c.mo26260a(tdx, syf.m36577a(intent2.getBundleExtra("eventmanager.extra_param")), cbnw.m128030a(intent2.getIntExtra("eventmanager.aster_client", cbnw.UNKNOWN_CLIENT.mo3214a())))));
                        m22780a(resultReceiver, 4, bundle7);
                    } catch (tdw e12) {
                        bundle7.putSerializable(str22, e12);
                        m22780a(resultReceiver, 0, bundle7);
                    }
                } else if (c != 3) {
                    a3.mo26406a(tdx, 42);
                } else {
                    Bundle bundle8 = new Bundle();
                    try {
                        Bundle bundleExtra2 = intent2.getBundleExtra("eventmanager.extra_param");
                        boolean booleanExtra = intent2.getBooleanExtra("eventmanager.consent_value", false);
                        cbnw a11 = cbnw.m128030a(intent2.getIntExtra("eventmanager.aster_client", cbnw.UNKNOWN_CLIENT.mo3214a()));
                        byte[] byteArrayExtra = intent2.getByteArrayExtra("eventmanager.audit_token");
                        syf syf4 = eventManager.f30465a;
                        List a12 = syf.m36577a(bundleExtra2);
                        str4 = "failure_verification_exception_key";
                        try {
                            syf4.f45421c.mo26258a(tdx, booleanExtra, true, a11, byteArrayExtra, a12);
                            m22780a(resultReceiver, 5, Bundle.EMPTY);
                        } catch (tdw e13) {
                            e = e13;
                            bundle8.putSerializable(str4, e);
                            m22780a(resultReceiver, 0, bundle8);
                        }
                    } catch (tdw e14) {
                        e = e14;
                        str4 = "failure_verification_exception_key";
                        bundle8.putSerializable(str4, e);
                        m22780a(resultReceiver, 0, bundle8);
                    }
                }
            } else {
                ResultReceiver resultReceiver4 = resultReceiver;
                tdx tdx7 = tdx;
                String str23 = "failure_verification_exception_key";
                if (eventManager.f30467d) {
                    a3.mo26410a(tdx7, 34, eventManager.f30468e);
                }
                f30464b.mo25416d("Event manager is not initialized", new Object[0]);
                tdi.m36751a(getBaseContext().getApplicationContext());
                tdw tdw2 = new tdw(52, !tdi.m36752b(getBaseContext()));
                eventManager.m22781a(tdw2);
                Bundle bundle9 = new Bundle();
                bundle9.putSerializable(str23, tdw2);
                m22780a(resultReceiver4, 0, bundle9);
            }
        }
    }

    /* renamed from: a */
    private final void m22779a() {
        Context applicationContext = getApplicationContext();
        szq a = szq.m36667a(applicationContext.getApplicationContext());
        a.mo26299j();
        a.mo26298i();
        this.f30466c.mo26230a(applicationContext);
        m22784b();
    }

    /* renamed from: b */
    private final void m22784b() {
        if (cdfb.m132905c()) {
            if (!this.f30469f.mo26301l()) {
                return;
            }
        } else if (!this.f30469f.mo26292c()) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (cdfn.m132939b()) {
            szg.m36644a().mo26267b();
            RefreshGcmTaskChimeraService.m22786a(getApplicationContext());
        }
        int i2 = Build.VERSION.SDK_INT;
        if (cdfn.m132940c()) {
            szm.m36651a().mo26276b();
            RefreshGcmTaskChimeraService.m22788b(getApplicationContext());
        }
    }

    /* renamed from: a */
    private static final void m22780a(ResultReceiver resultReceiver, int i, Bundle bundle) {
        if (resultReceiver != null) {
            resultReceiver.send(i, bundle);
        }
    }

    /* renamed from: a */
    private final void m22781a(tdw tdw) {
        if (tdw.f45706a) {
            syc syc = this.f30466c;
            Context applicationContext = getApplicationContext();
            int i = Build.VERSION.SDK_INT;
            if (cdfw.f180710a.mo6606a().mo77456k()) {
                Pair h = szq.m36667a(applicationContext).mo26297h();
                if (((Long) h.first).longValue() != -1) {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    szq a = szq.m36667a(applicationContext2);
                    int intValue = ((Integer) h.second).intValue();
                    if (((Long) h.first).longValue() == -1) {
                        syc.f45414a.mo25412b("Cannot schedule the next re-try time: current one is non-existing", new Object[0]);
                        a.mo26298i();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (intValue >= syc.f45417b.size()) {
                            syc.f45414a.mo25412b("Cannot schedule the next re-try time: reach the end of the scheduling.", new Object[0]);
                            a.mo26298i();
                            a.mo26299j();
                            syc.mo26230a(applicationContext);
                        } else {
                            long longValue = currentTimeMillis + ((Long) syc.f45417b.get(intValue)).longValue();
                            RefreshGcmTaskChimeraService.m22787a(applicationContext2, longValue, true);
                            a.mo26285a(longValue, intValue + 1);
                        }
                    }
                } else {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (!syc.f45417b.isEmpty()) {
                        long longValue2 = ((Long) syc.f45417b.get(0)).longValue() + currentTimeMillis2;
                        Context applicationContext3 = applicationContext.getApplicationContext();
                        szq a2 = szq.m36667a(applicationContext3);
                        long j = a2.f45525b.getLong("sync_retry_scheduling_frozen_timestamp_in_millis", 0);
                        if (j > System.currentTimeMillis()) {
                            syc.f45414a.mo25412b("Sync re-try is frozen util %s", tdo.m36765b(j));
                        } else {
                            a2.mo26299j();
                            long min = Math.min(longValue2, syc.mo26229a(applicationContext, currentTimeMillis2));
                            RefreshGcmTaskChimeraService.m22787a(applicationContext3, min, true);
                            long currentTimeMillis3 = System.currentTimeMillis();
                            SharedPreferences.Editor edit = a2.f45525b.edit();
                            edit.putLong("sync_retry_scheduling_frozen_timestamp_in_millis", currentTimeMillis3 + 86400000);
                            edit.apply();
                            a2.mo26285a(min, 1);
                        }
                    }
                }
            } else {
                syc.f45414a.mo25412b("Retry sync is disabled", new Object[0]);
            }
        }
        m22784b();
    }

    /* renamed from: a */
    private static final boolean m22782a(String str) {
        return "com.google.android.gms.constellation.eventmanager.SYNC_VERIFICATION_IF_STATE_MISMATCH".equals(str) || "com.google.android.gms.constellation.eventmanager.SYNC_VERIFICATION".equals(str) || "com.google.android.gms.constellation.eventmanager.GET_ASTERISM_CONSENT".equals(str) || "com.google.android.gms.constellation.eventmanager.SET_ASTERISM_CONSENT".equals(str);
    }
}
