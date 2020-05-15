package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;

/* renamed from: arfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arfq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ arfr f87608a;

    public arfq(arfr arfr) {
        this.f87608a = arfr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02cb, code lost:
        if (r0.length != 3) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02cd, code lost:
        p000.arrv.f88192j.mo25416d("Model id is not valid.", new java.lang.Object[0]);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02d9, code lost:
        if (r0 != null) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02db, code lost:
        r20 = r2;
        r0 = new android.bluetooth.le.AdvertiseData.Builder().addServiceData(new android.os.ParcelUuid(p000.ayod.f98113a), r0).setIncludeTxPowerLevel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02f2, code lost:
        if (r11 != null) goto L_0x02f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02f4, code lost:
        r0.addManufacturerData(com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02f9, code lost:
        r13.startAdvertising(r6, r0.build(), r12);
        r14.f88197i = r12;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0304, code lost:
        r20 = r2;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0308, code lost:
        r20 = r2;
        p000.arrv.f88192j.mo25416d("BLE advertising is not supported.", new java.lang.Object[0]);
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007a, code lost:
        if (r7 == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0316, code lost:
        r20 = r2;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0319, code lost:
        r1 = r10.f87562f;
        r2 = r1.f88194f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x031d, code lost:
        if (r2 != null) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x031f, code lost:
        r1.f88196h = r2.openGattServer(r1.f88195g, r1.f88198k);
        r1 = r1.f88196h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x032b, code lost:
        if (r1 == null) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x032d, code lost:
        p000.arrv.f88192j.mo25416d("Unable to start GATT server.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0338, code lost:
        r6 = new android.bluetooth.BluetoothGattService(p000.arrv.f88188a, 0);
        r2 = new android.bluetooth.BluetoothGattCharacteristic(p000.arrv.f88189b, 2, 1);
        r2.addDescriptor(new android.bluetooth.BluetoothGattDescriptor(p000.arrv.f88190c, 17));
        r6.addCharacteristic(r2);
        r1 = r1.addService(r6);
        r2 = p000.arrv.f88192j;
        r6 = new java.lang.StringBuilder(25);
        r6.append("Add service result: ");
        r6.append(r1);
        r2.mo25412b(r6.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0377, code lost:
        if (r0 != false) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x037a, code lost:
        r0 = r10.f87560d.f87919j.f87930b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0382, code lost:
        if (r0.f164950c != false) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0385, code lost:
        r0.mo74035c();
        r0.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x038b, code lost:
        r0 = (p000.bowi) r0.f164949b;
        r1 = p000.bowi.f135132i;
        r0.f135134a |= 128;
        r0.f135141h = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x039b, code lost:
        r20 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x039d, code lost:
        p000.arfd.f87557a.mo25409a("Starting advertising through Nearby Connections.", new java.lang.Object[0]);
        r10.f87567k = r5;
        r10.f87568l = false;
        r0 = new p000.ahht();
        r0.mo36508a(com.google.android.gms.nearby.connection.Strategy.f80482c);
        r0.mo36509a(false);
        r1 = r0.f67222a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03be, code lost:
        if (p000.cgpg.m146450d() != false) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03c0, code lost:
        r0 = r4.f107827A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03c2, code lost:
        if (r0 == null) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03c4, code lost:
        r5 = new java.security.SecureRandom().nextLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03d1, code lost:
        if (r5 != Long.MIN_VALUE) goto L_0x03d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03d3, code lost:
        r5 = java.lang.Math.abs(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0084, code lost:
        if (r4.mo59048b().mo48320a(8) != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03d8, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03da, code lost:
        r0 = java.lang.Long.toString(r5);
        r0 = r0.substring(0, java.lang.Math.min(4, r0.length()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03ec, code lost:
        r10.f87570n = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03f8, code lost:
        if (p000.cgqv.f187578a.mo84341d().mo84343b() != false) goto L_0x03fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03fa, code lost:
        r10.f87572p = p000.arfd.m72634b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0400, code lost:
        r0 = r10.f87559c;
        r2 = r10.f87570n;
        r5 = r10.f87571o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0408, code lost:
        if (r4.f107851x == null) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0086, code lost:
        r0.f107909c = p000.cgrq.f187602a.mo6606a().mo84360b();
        r0.f107907a.add(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0427, code lost:
        if (((int) p000.cgqs.f187523a.mo6606a().mo84317c()) == 1) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x042f, code lost:
        if (p000.cgou.m146382g() == false) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0436, code lost:
        r4 = p000.bowh.m111606a(r4.f107792b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x043d, code lost:
        r4 = p000.arns.m73194a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0441, code lost:
        r6 = new p000.arnw();
        r6.f87986a = r9;
        p000.sre.m36088h(r0);
        p000.sre.m36087g(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0457, code lost:
        if (p000.sre.m36081a(r0.getResources()) == false) goto L_0x0459;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0459, code lost:
        p000.sre.m36089i(r0);
        r18 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x045f, code lost:
        r18 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0461, code lost:
        r0 = r6.f87987b;
        r8 = r0.f87984a;
        r8[1] = (byte) (r18 - 1);
        r8[0] = (byte) r4.f135131g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0474, code lost:
        if (r2 != null) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        r2 = r2.getBytes("UTF-8");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x047a, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x047b, code lost:
        r12 = r2.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009d, code lost:
        if (r2.f87589g != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x047c, code lost:
        if (r8 >= r12) goto L_0x048b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0480, code lost:
        r0.f87984a[r8 + 2] = r2[r8];
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x048c, code lost:
        if (r12 < 5) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x048e, code lost:
        r0.f87984a[r12 + 2] = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0497, code lost:
        if (r5 != null) goto L_0x0499;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0499, code lost:
        r0 = r6.f87987b.f87984a;
        r0[7] = r5[0];
        r0[8] = r5[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009f, code lost:
        r2.f87589g = new p000.arfd(r2.f87584b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        r0 = r6.f87986a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04ab, code lost:
        if (r0 != null) goto L_0x04ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04ad, code lost:
        r0 = r0.replace(p000.arnx.f87988a, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        r2 = r0.getBytes("UTF-8").length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04ba, code lost:
        if (r2 <= 18) goto L_0x04bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04bc, code lost:
        if (r2 < 18) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04be, code lost:
        r0 = java.lang.String.valueOf(r0);
        r2 = java.lang.String.valueOf(p000.arnx.f87988a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a8, code lost:
        r7 = r2.f87589g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04cc, code lost:
        if (r2.length() == 0) goto L_0x04ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04ce, code lost:
        r0 = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04d5, code lost:
        r0 = r0.concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04d9, code lost:
        r2 = new p000.arnx(r0, r6.f87987b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04e1, code lost:
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 34);
        r6.append(r0);
        r6.append(" exceeds max length is ");
        r6.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0504, code lost:
        throw new p000.arny(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0505, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x050c, code lost:
        throw new p000.arny(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b0, code lost:
        if (p000.ascn.m73781a(r4.f107839l) != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0514, code lost:
        throw new p000.arny("No display name");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0515, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0516, code lost:
        p000.arfd.f87557a.mo25415d("Failed building advertisement-v1, reverting to v0", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0520, code lost:
        r2 = new p000.arnv(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0526, code lost:
        r2 = new p000.arnv(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x052b, code lost:
        r1 = r10.f87561e.mo36523a(r2.mo48700c(), p000.cgqs.m146601g(), new p000.arng(r10.f87574r, r10.f87575s), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        p000.aucu.m76782a(r1);
        r0 = ((p000.arfd) r7).f87560d.f87919j;
        r4 = r0.f87930b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0550, code lost:
        if (r4.f164950c != false) goto L_0x0553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b2, code lost:
        r4.mo59045a(p000.ascn.m73780a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0553, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0559, code lost:
        r4 = (p000.bowi) r4.f164949b;
        r5 = p000.bowi.f135132i;
        r4.f135134a |= 1;
        r4.f135135b = true;
        r0.f87929a = android.os.SystemClock.elapsedRealtime();
        r4 = r2.mo48699b().mo48692a();
        r0 = r0.f87930b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0579, code lost:
        if (r0.f164950c != false) goto L_0x057c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x057c, code lost:
        r0.mo74035c();
        r0.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0582, code lost:
        r0 = (p000.bowi) r0.f164949b;
        r0.f135140g = r4.f135131g;
        r0.f135134a |= 32;
        ((p000.arfd) r7).f87564h = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0595, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0598, code lost:
        r1 = r1.mo50387e();
        p000.arfd.f87557a.mo25415d("Failed to advertise", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05a6, code lost:
        if (r1 != null) goto L_0x05a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05a8, code lost:
        r0 = p000.aucu.m76777a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05ad, code lost:
        r0 = p000.aucu.m76778a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05b2, code lost:
        r0.mo50373a(new p000.arfe(r20, r3));
        r0.mo50372a(new p000.arff(r20, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05cc, code lost:
        throw new java.lang.RuntimeException("You must call setDisambiguationNumber before callinggetDisambiguationNumber or getDeviceName");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05d4, code lost:
        throw new java.lang.RuntimeException("Resources have not been initialized");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c3, code lost:
        if (p000.cgrq.f187602a.mo6606a().mo84364f() == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c5, code lost:
        r4.mo59060e(r2.f87588f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ca, code lost:
        r0 = r2.f87586d;
        r0.mo48659a(r4.f107839l);
        r0.mo48662a(r4.f107836i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00da, code lost:
        if (p000.cgqs.m146608n() != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00dc, code lost:
        r2.f87586d.mo48667d(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e2, code lost:
        r2.f87586d.mo48667d(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e7, code lost:
        r4.mo59051b(p000.asbu.m73760a(r2.f87585c));
        r4.mo59058d(p000.cgqs.m146603i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fb, code lost:
        if (p000.cgqs.m146608n() != false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fd, code lost:
        r0 = p000.aqxm.m72203d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0102, code lost:
        r0 = p000.aqxm.m72202c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0106, code lost:
        r4.mo59052c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0114, code lost:
        if (r2.f87587e.mo49051a().mo17710c() != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0116, code lost:
        p000.arfh.f87583a.mo25412b("Failed to enable bluetooth", new java.lang.Object[0]);
        p000.arfh.m72643b(r3, new com.google.android.gms.common.api.Status(10550));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0129, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x012a, code lost:
        r2.f87590h = r5;
        r2.f87593k = true;
        r0 = r2.f87587e.f88716a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0132, code lost:
        if (r0 == null) goto L_0x05cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0134, code lost:
        p000.arlm.f87846a = java.lang.Integer.valueOf(java.lang.Math.abs(r0.mo49049d().hashCode()));
        r0 = new p000.arlm(android.os.Build.MODEL);
        r14 = java.util.Locale.US;
        r15 = new java.lang.Object[1];
        r9 = java.util.Locale.US;
        r10 = new java.lang.Object[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0157, code lost:
        if (p000.arlm.f87846a == null) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0159, code lost:
        r10[0] = java.lang.Integer.valueOf(p000.arlm.f87846a.intValue());
        r9 = java.lang.String.format(r9, "%03d", r10);
        r15[0] = r9.substring(r9.length() - 3);
        r9 = java.lang.String.format(r14, " (%s)", r15);
        r10 = r9.length();
        r0 = r0.f87847b;
        r10 = 18 - r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x018d, code lost:
        if (r0.getBytes().length <= r10) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x018f, code lost:
        r0 = r0.substring(0, r10 - 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x019b, code lost:
        if ((r0.getBytes().length + 3) <= r10) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x019d, code lost:
        r0 = r0.substring(0, r0.length() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01a7, code lost:
        r0 = java.lang.String.valueOf(r0).concat("...");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01b1, code lost:
        r2.f87592j = java.lang.String.format(java.util.Locale.US, "%s%s", r0, r9);
        r5 = r2.mo48480a(r4, r5);
        r9 = r2.f87592j;
        r0 = new java.util.Random().nextInt(1000);
        r10 = (p000.arfd) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01d9, code lost:
        if (r10.f87567k == null) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01db, code lost:
        p000.arfd.f87557a.mo25412b("Already advertising!", new java.lang.Object[0]);
        r0 = p000.aucu.m76778a((java.lang.Object) null);
        r20 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01f6, code lost:
        if (p000.cgqa.f187489a.mo84260e().mo84268h() != false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01f9, code lost:
        if (r0 == -1) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01fb, code lost:
        r10.f87571o = p000.arrv.m73361a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0201, code lost:
        r14 = r10.f87562f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0205, code lost:
        if (r14 == null) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0207, code lost:
        r11 = r10.f87571o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x020b, code lost:
        if (r14.f88197i != null) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x020f, code lost:
        if (r14.f88193e != null) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0211, code lost:
        r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0215, code lost:
        if (r0 != null) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0218, code lost:
        r14.f88193e = r0.getBluetoothLeAdvertiser();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x021e, code lost:
        r13 = r14.f88193e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0220, code lost:
        if (r13 == null) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0222, code lost:
        r12 = new p000.arrt(r14);
        r0 = p000.cgqa.f187489a.mo84260e().mo84270j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0235, code lost:
        switch(r0.hashCode()) {
            case -2024701067: goto L_0x0257;
            case -53784575: goto L_0x024d;
            case 75572: goto L_0x0243;
            case 2217378: goto L_0x0239;
            default: goto L_0x0238;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x023f, code lost:
        if (r0.equals("HIGH") == false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0241, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0249, code lost:
        if (r0.equals("LOW") == false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x024b, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0253, code lost:
        if (r0.equals("ULTRA_LOW") == false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0255, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x025d, code lost:
        if (r0.equals("MEDIUM") == false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x025f, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0261, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0262, code lost:
        if (r0 == 0) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0264, code lost:
        if (r0 == 1) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0267, code lost:
        if (r0 == 2) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x026a, code lost:
        if (r0 == 3) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x026c, code lost:
        p000.arrv.f88192j.mo25416d("Invalid tx power, using TX_POWER_HIGH as default.", new java.lang.Object[0]);
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0278, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x027a, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x027c, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x027e, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x027f, code lost:
        r6 = new android.bluetooth.le.AdvertiseSettings.Builder().setAdvertiseMode(2).setTxPowerLevel(r0).setConnectable(true).build();
        r0 = p000.stn.m36304a("gms.smartdevice.model_id", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02a0, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02a2, code lost:
        r0 = p000.cgqa.f187489a.mo84260e().mo84264d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02ac, code lost:
        r20 = new byte[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b7, code lost:
        if (r0.length() != 6) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r0 = p000.srv.m36161a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02be, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02bf, code lost:
        p000.arrv.f88192j.mo25410a((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02c7, code lost:
        r0 = r20;
     */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0552 A[Catch:{ InterruptedException | ExecutionException -> 0x0595 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0553 A[Catch:{ InterruptedException | ExecutionException -> 0x0595 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x057b A[Catch:{ InterruptedException | ExecutionException -> 0x0595 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x057c A[Catch:{ InterruptedException | ExecutionException -> 0x0595 }] */
    public final void run() {
        arfr arfr = this.f87608a;
        argg argg = arfr.f87611c;
        arjf arjf = arfr.f87612d;
        BootstrapOptions bootstrapOptions = arfr.f87609a;
        arjc arjc = arfr.f87610b;
        argg.f87654a.mo48666c(2);
        arml.m73129a(argg.f87654a, 11);
        arfh arfh = argg.f87655b;
        arec arec = new arec(arjc, arfh.f87585c);
        if (!arfh.f87591i) {
            PostTransferAction postTransferAction = bootstrapOptions.f107848u;
            if (postTransferAction == null) {
                postTransferAction = new PostTransferAction();
                bootstrapOptions.mo59046a(postTransferAction);
            }
            boolean z = !cgrq.f187602a.mo6606a().mo84363e();
            if (z || bootstrapOptions.mo59048b().mo48320a(9)) {
                postTransferAction.f107910d = bjaw.m103130a(arfh.f87585c, C0126R.string.restore_app_uri);
                postTransferAction.f107907a.add(4);
                postTransferAction.f107911e = bjaw.m103130a(arfh.f87585c, C0126R.string.restore_app_package);
                postTransferAction.f107907a.add(5);
            }
        } else {
            arfh.m72643b(arjf, new Status(10551));
        }
    }
}
