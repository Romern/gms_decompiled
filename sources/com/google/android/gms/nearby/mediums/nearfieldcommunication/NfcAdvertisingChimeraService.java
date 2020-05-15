package com.google.android.gms.nearby.mediums.nearfieldcommunication;

import android.os.Bundle;
import com.google.android.chimera.HostApduService;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NfcAdvertisingChimeraService extends HostApduService {

    /* renamed from: a */
    public volatile airy f80664a;

    /* renamed from: a */
    private static airu m67370a(airt airt) {
        try {
            bvgm bvgm = (bvgm) bxvk.m124016a(bvgm.f156012e, airt.f69597g, bxus.m123744c());
            String str = bvgm.f156015b;
            String str2 = bvgm.f156016c;
            byte[] k = bvgm.f156017d.mo73780k();
            if (str.isEmpty()) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                bnsl.mo68432a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "a", 107, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Ignoring ADVERTISEMENT command from remote device. No service ID was passed in.");
                return airu.m57827b();
            }
            byte[] c = airz.m57841a().mo37926c(str);
            if (c == null) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68432a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "a", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Ignoring ADVERTISEMENT command from remote device. We are not currently advertising for service %s.", str);
                airz.m57841a().mo37919a(str);
                return airu.m57827b();
            }
            airz.m57841a().mo37922a(str, str2, k);
            srn srn = ailf.f69111a;
            return airu.m57826a(c);
        } catch (bxwf e) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68437a(e);
            bnsl3.mo68432a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Ignoring ADVERTISEMENT command from remote device. Invalid protocol buffer data format.");
            return airu.m57827b();
        }
    }

    /* renamed from: a */
    private final boolean m67371a() {
        return this.f80664a != null;
    }

    /* renamed from: b */
    private final airu m67372b(airt airt) {
        String str = new String(airt.f69597g);
        if (str.isEmpty()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "b", 133, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Ignoring CONNECT command from remote device. No service ID was passed in.");
            return airu.m57827b();
        } else if (m67371a()) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "b", 140, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Ignoring CONNECT command from remote device. We already have a socket connection.");
            return airu.m57827b();
        } else {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "b", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Accepting incoming NFC connection.");
            airy airy = new airy();
            airy.mo37637a(new aisa(this, airy));
            if (!airz.m57841a().mo37923a(str, airy)) {
                ails.m57440a(airy, "NFC", airy.f69126a);
                return airu.m57827b();
            }
            this.f80664a = airy;
            return airu.m57825a();
        }
    }

    /* renamed from: c */
    private final airu m67373c(airt airt) {
        if (!m67371a()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "c", 161, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Ignoring DATA command from remote device. We do not have an ongoing socket.");
            return airu.m57827b();
        }
        this.f80664a.mo37916a(airt.f69597g);
        return airu.m57826a(this.f80664a.mo37917a(airv.m57831a(airt.f69599i)));
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (byte[] bArr : airz.m57841a().mo37924b()) {
            sb.append("{ ");
            sb.append(ails.m57438a(bArr));
            sb.append(" } ");
        }
        printWriter.println(String.format("NfcAdvertisingService { hasSocketConnection=%s, advertisements=%s }", Boolean.valueOf(m67371a()), sb));
    }

    public final void onDeactivated(int i) {
        String str;
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "onDeactivated", 55, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        if (i != 0) {
            str = i != 1 ? "UNKNOWN" : "DEACTIVATION_DESELECTED";
        } else {
            str = "DEACTIVATION_LINK_LOSS";
        }
        bnsl.mo68420a("Remote NFC device has disconnected: %s.", String.format(Locale.ENGLISH, "[%d]%s", Integer.valueOf(i), str));
        ails.m57440a(this.f80664a, "NFC", "NfcAdvertisingSocket");
    }

    public final byte[] processCommandApdu(byte[] bArr, Bundle bundle) {
        airt airt;
        airu airu;
        airu airu2;
        airu airu3;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7 = bArr;
        int length = bArr7.length;
        if (length < 4) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("airt", "a", 55, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to parse request %s because the byte array was too short", ails.m57438a(bArr));
            airt = null;
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b = wrap.get();
            byte b2 = wrap.get();
            byte b3 = wrap.get();
            byte b4 = wrap.get();
            if (length == 4) {
                bArr6 = new byte[0];
                bArr5 = new byte[0];
                bArr4 = new byte[0];
                bArr3 = new byte[0];
                bArr2 = new byte[0];
            } else if (length == 5) {
                bArr6 = new byte[0];
                bArr5 = new byte[0];
                bArr4 = new byte[0];
                bArr3 = new byte[0];
                bArr2 = new byte[1];
            } else {
                byte b5 = bArr7[4];
                if (b5 == 0 && length == 7) {
                    bArr6 = new byte[0];
                    bArr5 = new byte[0];
                    bArr4 = new byte[0];
                    bArr3 = new byte[1];
                    bArr2 = new byte[2];
                } else if (b5 == 0) {
                    byte[] bArr8 = new byte[1];
                    byte[] bArr9 = {bArr7[5], bArr7[6]};
                    if (length >= airv.m57831a(bArr9) + 7) {
                        int a = airv.m57831a(bArr9);
                        byte[] bArr10 = new byte[a];
                        byte[] bArr11 = new byte[0];
                        int i = length - (a + 7);
                        byte[] bArr12 = new byte[i];
                        if (i > 2) {
                            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                            bnsl2.mo68432a("airt", "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68420a("Failed to parse request %s because the byte array was too long", ails.m57438a(bArr));
                            airt = null;
                        } else {
                            bArr2 = bArr12;
                            bArr6 = bArr8;
                            bArr4 = bArr10;
                            bArr5 = bArr9;
                            bArr3 = bArr11;
                        }
                    } else {
                        bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
                        bnsl3.mo68432a("airt", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68420a("Failed to parse request %s because the byte array was too short", ails.m57438a(bArr));
                        airt = null;
                    }
                } else {
                    byte[] bArr13 = new byte[0];
                    byte[] bArr14 = {b5};
                    if (length >= airv.m57831a(bArr14) + 5) {
                        int a2 = airv.m57831a(bArr14);
                        bArr4 = new byte[a2];
                        byte[] bArr15 = new byte[0];
                        int i2 = length - (a2 + 5);
                        byte[] bArr16 = new byte[i2];
                        if (i2 > 2) {
                            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68388c();
                            bnsl4.mo68432a("airt", "a", 135, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl4.mo68420a("Failed to parse request %s because the byte array was too long", ails.m57438a(bArr));
                            airt = null;
                        } else {
                            bArr6 = bArr13;
                            bArr2 = bArr16;
                            bArr5 = bArr14;
                            bArr3 = bArr15;
                        }
                    } else {
                        bnsl bnsl5 = (bnsl) ailf.f69111a.mo68388c();
                        bnsl5.mo68432a("airt", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68420a("Failed to parse request %s because the byte array was too short", ails.m57438a(bArr));
                        airt = null;
                    }
                }
            }
            wrap.get(bArr6);
            wrap.get(bArr5);
            wrap.get(bArr4);
            wrap.get(bArr3);
            wrap.get(bArr2);
            airt = new airt(b, b2, b3, b4, bArr4, airv.m57831a(bArr2));
        }
        if (airt != null && airt.f69591a == 0 && airt.f69592b == -92) {
            return airu.m57825a().mo37912d();
        }
        if (airt != null && airt.f69591a == Byte.MIN_VALUE && airt.f69592b == 1) {
            try {
                bvgm bvgm = (bvgm) bxvk.m124016a(bvgm.f156012e, airt.f69597g, bxus.m123744c());
                String str = bvgm.f156015b;
                String str2 = bvgm.f156016c;
                byte[] k = bvgm.f156017d.mo73780k();
                if (str.isEmpty()) {
                    bnsl bnsl6 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl6.mo68432a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "a", 107, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68405a("Ignoring ADVERTISEMENT command from remote device. No service ID was passed in.");
                    airu3 = airu.m57827b();
                } else {
                    byte[] c = airz.m57841a().mo37926c(str);
                    if (c == null) {
                        bnsl bnsl7 = (bnsl) ailf.f69111a.mo68390d();
                        bnsl7.mo68432a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "a", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl7.mo68420a("Ignoring ADVERTISEMENT command from remote device. We are not currently advertising for service %s.", str);
                        airz.m57841a().mo37919a(str);
                        airu3 = airu.m57827b();
                    } else {
                        airz.m57841a().mo37922a(str, str2, k);
                        srn srn = ailf.f69111a;
                        airu3 = airu.m57826a(c);
                    }
                }
            } catch (bxwf e) {
                bnsl bnsl8 = (bnsl) ailf.f69111a.mo68390d();
                bnsl8.mo68437a(e);
                bnsl8.mo68432a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl8.mo68405a("Ignoring ADVERTISEMENT command from remote device. Invalid protocol buffer data format.");
                airu3 = airu.m57827b();
            }
            return airu3.mo37912d();
        } else if (airt != null && airt.f69591a == Byte.MIN_VALUE && airt.f69592b == 2) {
            String str3 = new String(airt.f69597g);
            if (str3.isEmpty()) {
                bnsl bnsl9 = (bnsl) ailf.f69111a.mo68390d();
                bnsl9.mo68432a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "b", 133, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl9.mo68405a("Ignoring CONNECT command from remote device. No service ID was passed in.");
                airu2 = airu.m57827b();
            } else if (m67371a()) {
                bnsl bnsl10 = (bnsl) ailf.f69111a.mo68390d();
                bnsl10.mo68432a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "b", 140, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl10.mo68405a("Ignoring CONNECT command from remote device. We already have a socket connection.");
                airu2 = airu.m57827b();
            } else {
                bnsl bnsl11 = (bnsl) ailf.f69111a.mo68390d();
                bnsl11.mo68432a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "b", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl11.mo68405a("Accepting incoming NFC connection.");
                airy airy = new airy();
                airy.mo37637a(new aisa(this, airy));
                if (!airz.m57841a().mo37923a(str3, airy)) {
                    ails.m57440a(airy, "NFC", airy.f69126a);
                    airu2 = airu.m57827b();
                } else {
                    this.f80664a = airy;
                    airu2 = airu.m57825a();
                }
            }
            return airu2.mo37912d();
        } else if (airt != null && airt.f69591a == Byte.MIN_VALUE && airt.f69592b == 3) {
            if (!m67371a()) {
                bnsl bnsl12 = (bnsl) ailf.f69111a.mo68390d();
                bnsl12.mo68432a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "c", 161, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl12.mo68405a("Ignoring DATA command from remote device. We do not have an ongoing socket.");
                airu = airu.m57827b();
            } else {
                this.f80664a.mo37916a(airt.f69597g);
                airu = airu.m57826a(this.f80664a.mo37917a(airv.m57831a(airt.f69599i)));
            }
            return airu.mo37912d();
        } else {
            bnsl bnsl13 = (bnsl) ailf.f69111a.mo68388c();
            bnsl13.mo68432a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "processCommandApdu", 46, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl13.mo68420a("Received unknown NFC command %s. Erroring out.", ails.m57438a(bArr));
            return airu.m57827b().mo37912d();
        }
    }
}
