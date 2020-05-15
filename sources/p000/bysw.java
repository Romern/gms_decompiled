package p000;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.SignatureException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/* renamed from: bysw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bysw {
    /* renamed from: a */
    public static bytc m125309a(byti byti) {
        int i = 1;
        if ((byti.f167673a & 1) != 0) {
            if ((((bytd) GeneratedMessageLite.m124007a(bytd.f167658d, byti.f167674b)).f167660a & 1) != 0) {
                bytc bytc = ((bytd) GeneratedMessageLite.m124007a(bytd.f167658d, byti.f167674b)).f167661b;
                if (bytc == null) {
                    bytc = bytc.f167647i;
                }
                if ((bytc.f167649a & 1) != 0) {
                    try {
                        int a = bytk.m125326a(bytc.f167650b);
                        if (a == 0) {
                            a = 1;
                        }
                        byss[] values = byss.values();
                        int length = values.length;
                        int i2 = 0;
                        int i3 = 0;
                        while (i3 < length) {
                            int i4 = values[i3].f167611f;
                            if (i4 == 0) {
                                throw null;
                            } else if (i4 == a) {
                                if ((bytc.f167649a & 2) != 0) {
                                    try {
                                        int a2 = byta.m125317a(bytc.f167651c);
                                        if (a2 != 0) {
                                            i = a2;
                                        }
                                        bysr[] values2 = bysr.values();
                                        int length2 = values2.length;
                                        while (i2 < length2) {
                                            int i5 = values2[i2].f167604d;
                                            if (i5 == 0) {
                                                throw null;
                                            } else if (i5 != i) {
                                                i2++;
                                            }
                                        }
                                        String valueOf = String.valueOf(Integer.toString(i));
                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                                        sb.append("Unsupported EncType: ");
                                        sb.append(valueOf);
                                        throw new IllegalArgumentException(sb.toString());
                                    } catch (IllegalArgumentException e) {
                                        throw new bxwf("Corrupt/unsupported EncryptionScheme");
                                    }
                                }
                                return bytc;
                            } else {
                                i3++;
                            }
                        }
                        String valueOf2 = String.valueOf(Integer.toString(a));
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                        sb2.append("Unsupported SigType: ");
                        sb2.append(valueOf2);
                        throw new IllegalArgumentException(sb2.toString());
                    } catch (IllegalArgumentException e2) {
                        throw new bxwf("Corrupt/unsupported SignatureScheme");
                    }
                } else {
                    throw new bxwf("Missing header field(s)");
                }
            } else {
                throw new bxwf("Missing header");
            }
        } else {
            throw new bxwf("Missing header and body");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x009e A[Catch:{ bxwf -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00a0 A[Catch:{ bxwf -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00a5 A[Catch:{ bxwf -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a6 A[Catch:{ bxwf -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ac A[Catch:{ bxwf -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00bd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00be  */
    /* renamed from: a */
    private static bytd m125310a(byti byti, Key key, byss byss, bysr bysr, byte[] bArr, boolean z) {
        bytd bytd;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        bytc bytc;
        int i2 = byti.f167673a;
        if ((i2 & 1) == 0 || (i2 & 2) == 0) {
            throw new SignatureException("Signature failed verification");
        }
        byte[] k = byti.f167675c.getKey();
        byte[] k2 = byti.f167674b.getKey();
        if (!z) {
            k2 = byst.m125288b(k2, bArr);
        }
        boolean a = byst.m125276a(key, byss, k, k2);
        boolean z6 = false;
        try {
            bytd = (bytd) GeneratedMessageLite.m124007a(bytd.f167658d, byti.f167674b);
            try {
                int i3 = bytd.f167660a;
                if ((i3 & 1) == 0 || (i3 & 2) == 0) {
                    throw new SignatureException("Signature failed verification");
                }
                bytc bytc2 = bytd.f167661b;
                if (bytc2 == null) {
                    bytc2 = bytc.f167647i;
                }
                int a2 = bytk.m125326a(bytc2.f167650b);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (a2 == byss.f167611f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z7 = a & z2;
                bytc bytc3 = bytd.f167661b;
                if (bytc3 == null) {
                    bytc3 = bytc.f167647i;
                }
                int a3 = byta.m125317a(bytc3.f167651c);
                if (a3 == 0) {
                    a3 = 1;
                }
                if (a3 == bysr.f167604d) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z8 = z7 & z3;
                if (bysr == bysr.NONE) {
                    bytc bytc4 = bytd.f167661b;
                    if (bytc4 == null) {
                        bytc4 = bytc.f167647i;
                    }
                    z4 = (bytc4.f167649a & 8) == 0;
                } else {
                    z4 = true;
                }
                boolean z9 = z8 & z4;
                if (bysr != bysr.NONE && byss.f167610e) {
                    bytc bytc5 = bytd.f167661b;
                    if (bytc5 == null) {
                        bytc5 = bytc.f167647i;
                    }
                    if ((bytc5.f167649a & 4) == 0) {
                        z5 = false;
                        boolean z10 = z9 & z5;
                        if (bArr == null) {
                            i = bArr.length;
                        } else {
                            i = 0;
                        }
                        bytc = bytd.f167661b;
                        if (bytc != null) {
                            bytc = bytc.f167647i;
                        }
                        if (bytc.f167656h == i) {
                            z6 = true;
                        }
                        z6 &= z10;
                        if (!z6) {
                            return bytd;
                        }
                        throw new SignatureException("Signature failed verification");
                    }
                }
                z5 = true;
                boolean z102 = z9 & z5;
                if (bArr == null) {
                }
                bytc = bytd.f167661b;
                if (bytc != null) {
                }
                if (bytc.f167656h == i) {
                }
                z6 &= z102;
                if (!z6) {
                }
            } catch (bxwf e) {
            }
        } catch (bxwf e2) {
            bytd = null;
        }
    }

    /* renamed from: a */
    public static bytd m125311a(byti byti, Key key, byss byss, Key key2, bysr bysr) {
        return m125312a(byti, key, byss, key2, bysr, (byte[]) null);
    }

    /* renamed from: a */
    public static bytd m125312a(byti byti, Key key, byss byss, Key key2, bysr bysr, byte[] bArr) {
        if (byti == null) {
            throw null;
        } else if (key == null) {
            throw null;
        } else if (byss == null) {
            throw null;
        } else if (key2 == null) {
            throw null;
        } else if (bysr == null) {
            throw null;
        } else if (bysr != bysr.NONE) {
            boolean a = bysv.m125302a(key, byss, key2);
            bytd a2 = m125310a(byti, key, byss, bysr, bArr, a);
            bytc bytc = a2.f167661b;
            if (bytc == null) {
                bytc = bytc.f167647i;
            }
            if ((bytc.f167649a & 16) != 0) {
                try {
                    byte[] a3 = byst.m125282a(key2, bysr, bytc.f167654f.getKey(), a2.f167662c.getKey());
                    if (!a) {
                        bxvd a4 = bytd.f167658d.mo74141a(a2);
                        ByteString a5 = ByteString.m123261a(a3);
                        if (a4.f164950c) {
                            a4.mo74035c();
                            a4.f164950c = false;
                        }
                        bytd bytd = (bytd) a4.f164949b;
                        a5.getClass();
                        bytd.f167660a |= 2;
                        bytd.f167662c = a5;
                        return (bytd) a4.mo74062i();
                    }
                    try {
                        byte[] a6 = byst.m125285a(byst.m125288b(((bytf) GeneratedMessageLite.m124007a(bytf.f167664d, byti.f167674b)).f167667b.getKey(), bArr));
                        int length = a3.length;
                        if (length < 20 || !byst.m125277a(byst.m125286a(a3, 20), a6)) {
                            throw new SignatureException();
                        }
                        bxvd a7 = bytd.f167658d.mo74141a(a2);
                        ByteString a8 = ByteString.m123262a(a3, 20, length - 20);
                        if (a7.f164950c) {
                            a7.mo74035c();
                            a7.f164950c = false;
                        }
                        bytd bytd2 = (bytd) a7.f164949b;
                        a8.getClass();
                        bytd2.f167660a |= 2;
                        bytd2.f167662c = a8;
                        return (bytd) a7.mo74062i();
                    } catch (bxwf e) {
                        throw new SignatureException(e);
                    }
                } catch (InvalidAlgorithmParameterException e2) {
                    throw new SignatureException();
                } catch (IllegalBlockSizeException e3) {
                    throw new SignatureException();
                } catch (BadPaddingException e4) {
                    throw new SignatureException();
                }
            } else {
                throw new SignatureException();
            }
        } else {
            throw new SignatureException("Not a signcrypted message");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bysw.a(byti, java.security.Key, byss, bysr, byte[], boolean):bytd
     arg types: [byti, java.security.Key, byss, bysr, byte[], int]
     candidates:
      bysw.a(byti, java.security.Key, byss, java.security.Key, bysr, byte[]):bytd
      bysw.a(byti, java.security.Key, byss, bysr, byte[], boolean):bytd */
    /* renamed from: a */
    public static void m125313a(byti byti, Key key, byss byss, byte[] bArr) {
        if (byti == null || key == null || byss == null) {
            throw null;
        }
        m125310a(byti, key, byss, bysr.NONE, bArr, false);
    }
}
