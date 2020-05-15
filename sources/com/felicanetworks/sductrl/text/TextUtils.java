package com.felicanetworks.sductrl.text;

import com.felicanetworks.cmnlib.AppContext;
import com.felicanetworks.cmnlib.p005sg.SgMgr;
import com.felicanetworks.cmnlib.util.CommonUtil;
import com.felicanetworks.cmnlib.util.DataCheckerUtil;
import com.felicanetworks.cmnlib.util.DateFormatter;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.sductrl.chip.ChipMgrInfoData;
import com.felicanetworks.sductrl.chip.FelicaAccess;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class TextUtils {

    /* renamed from: c */
    private static Map f7457c;

    /* renamed from: a */
    private final String f7458a = "50FHO3GBJCJ083K7";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AppContext f7459b;

    /* renamed from: com.felicanetworks.sductrl.text.TextUtils$a */
    class C0142a {

        /* renamed from: a */
        public byte[] f7460a;

        /* renamed from: b */
        public byte[] f7461b;

        private C0142a() {
            this.f7460a = new byte[16];
            this.f7461b = new byte[16];
        }

        /* renamed from: a */
        public void mo5019a(byte[] bArr) {
            byte[] bArr2 = this.f7460a;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            int length = this.f7460a.length;
            byte[] bArr3 = this.f7461b;
            System.arraycopy(bArr, length, bArr3, 0, bArr3.length);
        }
    }

    /* renamed from: com.felicanetworks.sductrl.text.TextUtils$b */
    public class C0143b {

        /* renamed from: a */
        public String f7463a = null;

        /* renamed from: b */
        public String f7464b = null;

        /* renamed from: c */
        public String f7465c = null;

        /* renamed from: d */
        public byte[] f7466d = null;

        public C0143b(String str) {
            String[] split = str.split(",");
            if (split.length == 4) {
                DataCheckerUtil.checkAlphaNumberFormat(split[0]);
                DataCheckerUtil.checkByteLength(split[0], 8, true);
                DataCheckerUtil.checkAlphaNumberFormat(split[1]);
                DataCheckerUtil.checkByteLength(split[1], 2, true);
                DataCheckerUtil.checkHexNumberFormat(split[2]);
                DataCheckerUtil.checkByteLength(split[2], 4, true);
                DataCheckerUtil.checkHexNumberFormat(split[3]);
                this.f7463a = split[0];
                this.f7464b = split[1];
                this.f7465c = split[2];
                this.f7466d = m4801a(split[3]);
                return;
            }
            throw new IllegalArgumentException("InitilizeInfo is Illegal Format.");
        }

        /* renamed from: a */
        private byte[] m4801a(String str) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                bArr[i] = (byte) Integer.parseInt(str.substring(i + i, i2 + i2), 16);
                i = i2;
            }
            return bArr;
        }
    }

    /* renamed from: com.felicanetworks.sductrl.text.TextUtils$c */
    public class C0144c {

        /* renamed from: a */
        public byte[] f7468a = null;

        /* renamed from: c */
        private C0145a f7470c = new C0145a();

        /* renamed from: d */
        private C0147c f7471d = new C0147c();

        /* renamed from: e */
        private C0146b f7472e = new C0146b();

        /* renamed from: com.felicanetworks.sductrl.text.TextUtils$c$a */
        public class C0145a {

            /* renamed from: a */
            public String f7473a = null;

            /* renamed from: b */
            public String f7474b = null;

            /* renamed from: c */
            public String f7475c = "000000000000000000000000000000";

            /* renamed from: d */
            public String f7476d = null;

            /* renamed from: e */
            public String f7477e = null;

            /* renamed from: f */
            public String f7478f = null;

            /* renamed from: g */
            public String f7479g = null;

            /* renamed from: h */
            public String f7480h = null;

            /* renamed from: i */
            public String f7481i = null;

            protected C0145a() {
            }

            /* renamed from: a */
            public String mo5027a() {
                return "hd=";
            }

            /* renamed from: b */
            public void mo5028b() {
                if (toString().getBytes().length != 122) {
                    throw new IllegalStateException("Length is wrong.");
                }
            }

            public String toString() {
                StringBuilder sb = new StringBuilder(122);
                sb.append("41");
                sb.append(this.f7473a);
                sb.append(this.f7474b);
                sb.append(this.f7475c);
                sb.append(this.f7476d);
                sb.append(this.f7477e);
                sb.append(this.f7478f);
                sb.append(this.f7479g);
                sb.append(this.f7480h);
                sb.append(this.f7481i);
                return sb.toString();
            }
        }

        /* renamed from: com.felicanetworks.sductrl.text.TextUtils$c$b */
        public class C0146b {

            /* renamed from: a */
            public String f7483a = null;

            /* renamed from: c */
            private final String f7485c = "sg=";

            protected C0146b() {
            }

            /* renamed from: a */
            public String mo5030a() {
                return "sg=";
            }

            public String toString() {
                return this.f7483a;
            }
        }

        /* renamed from: com.felicanetworks.sductrl.text.TextUtils$c$c */
        public class C0147c {

            /* renamed from: a */
            public String f7486a = null;

            protected C0147c() {
            }

            /* renamed from: a */
            public String mo5032a() {
                return "td=";
            }

            /* renamed from: b */
            public void mo5033b() {
                if (toString().getBytes().length != 22) {
                    throw new IllegalStateException("Length is wrong.");
                }
            }

            public String toString() {
                return this.f7486a;
            }
        }

        protected C0144c() {
        }

        /* renamed from: a */
        public void mo5020a() {
            this.f7470c.mo5028b();
            this.f7471d.mo5033b();
            this.f7472e.f7483a = CommonUtil.binToHexString(mo5025a((this.f7470c.toString() + this.f7471d.toString()).getBytes(), this.f7468a));
        }

        /* renamed from: a */
        public void mo5021a(ChipMgrInfoData chipMgrInfoData) {
            this.f7470c.f7479g = CommonUtil.binToHexString(chipMgrInfoData.idm).substring(0, 16);
            this.f7470c.f7480h = chipMgrInfoData.icCode.substring(0, 4);
            this.f7470c.f7481i = CommonUtil.binToHexString(chipMgrInfoData.container).substring(0, 32);
        }

        /* renamed from: a */
        public void mo5022a(C0143b bVar) {
            this.f7470c.f7473a = bVar.f7463a.substring(0, 8);
            this.f7470c.f7474b = bVar.f7464b.substring(0, 2);
            this.f7470c.f7478f = bVar.f7465c;
            this.f7468a = bVar.f7466d;
        }

        /* renamed from: a */
        public void mo5023a(String str) {
            StringBuilder sb = new StringBuilder(22);
            while (true) {
                sb.append(str);
                if (sb.length() < 22) {
                    str = "0";
                } else {
                    this.f7471d.f7486a = sb.substring(0, 22);
                    return;
                }
            }
        }

        /* renamed from: a */
        public void mo5024a(Date date, String str, int i) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            instance.add(12, i);
            Date time = instance.getTime();
            DateFormatter dateFormatter = new DateFormatter(DateFormatter.DATE_MINUTE, str);
            this.f7470c.f7476d = dateFormatter.format(date);
            this.f7470c.f7477e = dateFormatter.format(time);
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public byte[] mo5025a(byte[] bArr, byte[] bArr2) {
            char c;
            String str;
            String str2 = (String) TextUtils.this.f7459b.sgMgr.getSgValue(SgMgr.KEY_MFC_CARRIER_CODE);
            switch (str2.hashCode()) {
                case 1420005920:
                    if (str2.equals("000011")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1420005921:
                    if (str2.equals("000012")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1420005922:
                    if (str2.equals("000013")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1420005923:
                    if (str2.equals("000014")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1420005926:
                    if (str2.equals("000017")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1420005927:
                    if (str2.equals("000018")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1420006075:
                    if (str2.equals("000061")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1420006076:
                    if (str2.equals("000062")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1420006077:
                    if (str2.equals("000063")) {
                        c = 8;
                        break;
                    }
                    c = 65535;
                    break;
                case 1420006082:
                    if (str2.equals("000068")) {
                        c = 9;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    str = "SHA1withRSA";
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    str = "SHA256withRSA";
                    break;
                default:
                    throw new IllegalStateException("wrong carrier code");
            }
            Signature instance = Signature.getInstance(str);
            instance.initSign(KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr2)));
            instance.update(bArr);
            return instance.sign();
        }

        public String toString() {
            return this.f7470c.mo5027a() + this.f7470c.toString() + "&" + this.f7471d.mo5032a() + this.f7471d.toString() + "&" + this.f7472e.mo5030a() + this.f7472e.toString();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f7457c = hashMap;
        hashMap.put("000011", 27);
        f7457c.put("000012", 28);
        f7457c.put("000013", 29);
        f7457c.put("000014", 30);
        f7457c.put("000017", 31);
        f7457c.put("000018", 32);
        f7457c.put("000061", 33);
        f7457c.put("000062", 34);
        f7457c.put("000063", 35);
        f7457c.put("000068", 36);
    }

    public TextUtils(AppContext appContext) {
        this.f7459b = appContext;
    }

    /* renamed from: a */
    private byte[] m4797a(byte[] bArr) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(bArr);
        return instance.digest();
    }

    /* renamed from: a */
    private byte[] m4798a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, secretKeySpec, ivParameterSpec);
        return instance.doFinal(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] mo5017a(byte[] bArr, byte[] bArr2) {
        C0142a aVar = new C0142a();
        aVar.mo5019a(m4797a(bArr2));
        return m4798a(bArr, aVar.f7461b, aVar.f7460a);
    }

    public byte[] createTicket(String str, int i, FelicaAccess felicaAccess) {
        if (str == null || felicaAccess == null) {
            throw new IllegalArgumentException(str + ", " + felicaAccess);
        }
        try {
            C0144c cVar = new C0144c();
            ChipMgrInfoData chipMgrInfo = felicaAccess.getChipMgrInfo();
            cVar.mo5021a(chipMgrInfo);
            String binToHexString = CommonUtil.binToHexString(chipMgrInfo.carrier);
            Integer num = (Integer) f7457c.get(binToHexString);
            if (num != null) {
                cVar.mo5024a(CommonUtil.getSystemTime(), (String) this.f7459b.sgMgr.getSgValue(SgMgr.KEY_SRV_TIMEZONE), i);
                cVar.mo5022a(new C0143b(new String(mo5017a((byte[]) this.f7459b.sgMgr.getSgValue(num.intValue()), "50FHO3GBJCJ083K7".getBytes()), "UTF-8")));
                cVar.mo5023a(str);
                cVar.mo5020a();
                return cVar.toString().getBytes();
            }
            throw new IllegalArgumentException("carrier=" + binToHexString);
        } catch (FelicaException e) {
            throw e;
        } catch (Exception e2) {
            return null;
        }
    }
}
