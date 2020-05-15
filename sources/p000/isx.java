package p000;

import android.accounts.Account;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import com.google.android.gms.auth.cryptauth.KeyDerivationResult;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.PlainText;
import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import com.google.android.gms.auth.cryptauth.SignedBlob;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import javax.crypto.SecretKey;

/* renamed from: isx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class isx {

    /* renamed from: a */
    public final isv f21632a;

    /* renamed from: b */
    public final ipr f21633b;

    /* renamed from: c */
    public final isn f21634c;

    /* renamed from: d */
    private final sek f21635d = new sek(new String[]{"OracleUtils"}, (byte[]) null);

    public isx(isv isv, ipr ipr, isn isn) {
        this.f21632a = isv;
        this.f21633b = ipr;
        this.f21634c = isn;
    }

    /* renamed from: a */
    private static final bysr m16065a(bqmb bqmb) {
        bqmb bqmb2 = bqmb.KEY_TYPE_UNSPECIFIED;
        if (bqmb.ordinal() == 2) {
            return bysr.AES_256_CBC;
        }
        String valueOf = String.valueOf(bqmb);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("Unrecognized keyType:");
        sb.append(valueOf);
        throw new ehu(sb.toString());
    }

    /* renamed from: b */
    private static final byss m16068b(bqmb bqmb) {
        bqmb bqmb2 = bqmb.KEY_TYPE_UNSPECIFIED;
        if (bqmb.ordinal() == 4) {
            return byss.ECDSA_P256_SHA256;
        }
        String valueOf = String.valueOf(bqmb);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("Unrecognized keyType:");
        sb.append(valueOf);
        throw new iqs(sb.toString());
    }

    /* renamed from: a */
    private final PlainText m16066a(List list, Payload payload, String str) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            ita ita = (ita) list.get(i);
            try {
                return m16067a(ita.f21650a, payload, ita.f21651b, str);
            } catch (bxwf | ehu | InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
                this.f21635d.mo25412b("Failed to perform verifyDecrypt with a InActive key.", new Object[0]);
                i++;
            }
        }
        int size2 = list.size();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Failed to verifyDecrypt with ");
        sb.append(size2);
        sb.append(" Inactive Keys.");
        throw new iqs(sb.toString());
    }

    /* renamed from: b */
    public final PlainText mo13330b(String str, Account account, Payload payload) {
        if (payload.f10548d != null) {
            try {
                itb a = this.f21632a.mo13219a(str, account);
                try {
                    ita ita = a.f21655b;
                    return m16067a(ita.f21650a, payload, ita.f21651b, account.name);
                } catch (bxwf | ehu | InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
                    this.f21635d.mo25414c("Failed verifyDecrypt with Active key. Trying with Inactive keys.", new Object[0]);
                    this.f21634c.f21613b = 7;
                    return m16066a(a.f21654a, payload, account.name);
                }
            } catch (isu e2) {
                this.f21634c.f21613b = 10;
                throw e2;
            }
        } else {
            this.f21634c.f21613b = 2;
            throw new NullPointerException("Null payload.");
        }
    }

    /* renamed from: a */
    private static final PlainText m16067a(byte[] bArr, Payload payload, bqmb bqmb, String str) {
        SecretKey e = ehv.m10475e(bArr);
        bytd a = bysw.m125311a((byti) bxvk.m124014a(byti.f167671d, payload.f10548d), e, byss.HMAC_SHA256, e, m16065a(bqmb));
        Account account = new Account(str, "com.google");
        bytc bytc = a.f167661b;
        if (bytc == null) {
            bytc = bytc.f167647i;
        }
        return new PlainText(bytc.mo73642k(), a.f167662c.mo73780k(), account);
    }

    /* renamed from: a */
    public final KeyDerivationResult mo13322a(Account account, String str, String str2, byte[] bArr, byte[] bArr2) {
        if (bArr2 != null) {
            try {
                return new KeyDerivationResult(1, ehv.m10469a(this.f21632a.mo13219a(str, account).f21655b.f21650a, bArr, bArr2, str2, 32));
            } catch (InvalidKeyException e) {
                this.f21634c.f21613b = 8;
                throw new iqs(e);
            }
        } else {
            throw new NullPointerException("Null info");
        }
    }

    /* renamed from: a */
    public final PlainText mo13323a(String str, byte[] bArr, Payload payload) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        ehp ehp;
        int i;
        eht eht;
        Payload payload2 = payload;
        if (payload2.f10548d != null) {
            try {
                isv isv = this.f21632a;
                ipo.f21519c.mo25412b("Querying for key=%s, handle=%s", str, sqd.m35972d(bArr));
                ipp a = ipp.m15839a(((ipo) isv).f21520b);
                if (ccfj.m129447c()) {
                    sQLiteDatabase = a.getReadableDatabase();
                } else {
                    sQLiteDatabase = a.getReadableDatabase();
                }
                sQLiteDatabase.beginTransaction();
                Cursor cursor = null;
                try {
                    Cursor a2 = ipo.m15816a(sQLiteDatabase, "keys", null, "key_name = ? AND key_handle = ?", new String[]{str, sqd.m35972d(bArr)});
                    if (a2 != null) {
                        try {
                            if (a2.moveToFirst() && a2.getCount() != 0) {
                                String h = ipo.m15826h(a2);
                                ehc e = ipo.m15823e(a2);
                                bqmb f = ipo.m15824f(a2);
                                ehp = ipo.m15825g(a2);
                                try {
                                    i = ipo.m15830l(a2);
                                } catch (ehy e2) {
                                    ipo.f21519c.mo25410a((Throwable) e2);
                                    i = 1;
                                }
                                long k = ipo.m15829k(a2);
                                long j = ipo.m15828j(a2);
                                if (e.equals(ehc.SYMMETRIC_KEY)) {
                                    byte[] a3 = ipo.m15819a(a2);
                                    sQLiteDatabase.setTransactionSuccessful();
                                    ehp ehp2 = ehp;
                                    int i2 = i;
                                    sQLiteDatabase2 = sQLiteDatabase;
                                    eht eht2 = eht;
                                    try {
                                        eht = new eht(str, h, bArr, f, ehp2, i2, a3, k, j);
                                        sQLiteDatabase2.endTransaction();
                                        ipo.m15831m(a2);
                                        a.close();
                                        try {
                                            return m16067a(eht2.f15015c, payload2, eht2.f15014b, eht2.f15013a);
                                        } catch (bxwf | ehu | InvalidKeyException | NoSuchAlgorithmException | SignatureException e3) {
                                            this.f21634c.f21613b = 7;
                                            throw new iqs(e3);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = a2;
                                        sQLiteDatabase2.endTransaction();
                                        ipo.m15831m(cursor);
                                        a.close();
                                        throw th;
                                    }
                                } else {
                                    sQLiteDatabase2 = sQLiteDatabase;
                                    throw new isu("Only symmetric key can be retrieved by keyHandle");
                                }
                            }
                        } catch (ehy e4) {
                            ipo.f21519c.mo25410a((Throwable) e4);
                            ehp = ehp.UNKNOWN_KEY;
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteDatabase2 = sQLiteDatabase;
                            cursor = a2;
                            sQLiteDatabase2.endTransaction();
                            ipo.m15831m(cursor);
                            a.close();
                            throw th;
                        }
                    }
                    throw new isu("No key found in db");
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase2.endTransaction();
                    ipo.m15831m(cursor);
                    a.close();
                    throw th;
                }
            } catch (SQLiteException e5) {
                String valueOf = String.valueOf(e5.getMessage());
                throw new isu(valueOf.length() == 0 ? new String("failed to open db ") : "failed to open db ".concat(valueOf));
            } catch (isu e6) {
                this.f21634c.f21613b = 10;
                throw e6;
            }
        } else {
            this.f21634c.f21613b = 2;
            throw new NullPointerException("Null payload.");
        }
    }

    /* renamed from: a */
    public final PlainText mo13324a(PrivateKey privateKey, Account account, byte[] bArr) {
        try {
            byti byti = (byti) bxvk.m124014a(byti.f167671d, bArr);
            try {
                SecretKey a = ehv.m10463a(privateKey, bysu.m125293a((bytb) bxvk.m124007a(bytb.f167639f, bysw.m125309a(byti).f167653e)));
                try {
                    bytd a2 = bysw.m125311a(byti, a, byss.HMAC_SHA256, a, bysr.AES_256_CBC);
                    bytc bytc = a2.f167661b;
                    if (bytc == null) {
                        bytc = bytc.f167647i;
                    }
                    return new PlainText(bytc.mo73642k(), a2.f167662c.mo73780k(), account);
                } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
                    this.f21634c.f21613b = 7;
                    throw new iqs(e);
                }
            } catch (InvalidKeyException e2) {
                this.f21634c.f21613b = 9;
                throw new iqs(e2);
            }
        } catch (bxwf | InvalidKeySpecException e3) {
            this.f21634c.f21613b = 7;
            throw new iqs(e3);
        }
    }

    /* renamed from: a */
    public final SignCryptedBlob mo13325a(String str, String str2, Account account, Payload payload) {
        if (payload.f10548d != null) {
            try {
                isy b = this.f21632a.mo13221b(str, account);
                try {
                    ita ita = this.f21632a.mo13219a(str2, account).f21655b;
                    try {
                        PrivateKey d = ehv.m10474d(b.f21638c);
                        SecretKey a = byrr.m125225a(ita.f21650a);
                        bysv bysv = new bysv();
                        bysv.mo74502c(b.f21637b);
                        byte[] bArr = payload.f10547c;
                        if (bArr != null) {
                            bysv.mo74501b(bArr);
                        }
                        byte[] bArr2 = payload.f10546b;
                        if (bArr2 != null) {
                            bysv.f167622a = bArr2;
                        }
                        try {
                            byti a2 = bysv.mo74498a(d, m16068b(b.f21639d), a, m16065a(ita.f21651b), payload.f10548d);
                            return new SignCryptedBlob(a2.f167674b.mo73780k(), a2.mo73642k());
                        } catch (ehu | InvalidKeyException | NoSuchAlgorithmException e) {
                            this.f21634c.f21613b = 6;
                            throw new iqs(e);
                        }
                    } catch (InvalidKeySpecException e2) {
                        this.f21634c.f21613b = 3;
                        throw new iqs(e2);
                    }
                } catch (isu e3) {
                    this.f21634c.f21613b = 10;
                    throw e3;
                }
            } catch (isu e4) {
                this.f21634c.f21613b = 11;
                throw e4;
            }
        } else {
            this.f21634c.f21613b = 2;
            throw new NullPointerException("Null payload");
        }
    }

    /* renamed from: a */
    public final SignCryptedBlob mo13326a(PublicKey publicKey, byte[] bArr) {
        KeyPair b = ehv.m10470b();
        try {
            SecretKey a = ehv.m10463a(b.getPrivate(), publicKey);
            bysv bysv = new bysv();
            bysv.mo74500a(bysu.m125290a(b.getPublic()).mo73642k());
            try {
                byti a2 = bysv.mo74498a(a, byss.HMAC_SHA256, a, bysr.AES_256_CBC, bArr);
                return new SignCryptedBlob(a2.f167674b.mo73780k(), a2.mo73642k());
            } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                this.f21634c.f21613b = 6;
                throw new iqs(e);
            }
        } catch (InvalidKeyException e2) {
            this.f21634c.f21613b = 9;
            throw new iqs(e2);
        }
    }

    /* renamed from: a */
    public final SignedBlob mo13327a(String str, Account account, Payload payload) {
        if (payload.f10548d != null) {
            try {
                isy b = this.f21632a.mo13221b(str, account);
                try {
                    PrivateKey d = ehv.m10474d(b.f21638c);
                    bysv bysv = new bysv();
                    bysv.mo74502c(b.f21636a);
                    byte[] bArr = payload.f10547c;
                    if (bArr != null) {
                        bysv.mo74501b(bArr);
                    }
                    byte[] bArr2 = payload.f10546b;
                    if (bArr2 != null) {
                        bysv.f167622a = bArr2;
                    }
                    try {
                        return new SignedBlob(bysv.mo74499a(d, m16068b(b.f21639d), payload.f10548d).mo73642k());
                    } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                        this.f21634c.f21613b = 8;
                        throw new iqs(e);
                    }
                } catch (InvalidKeySpecException e2) {
                    this.f21634c.f21613b = 3;
                    throw new iqs(e2);
                }
            } catch (isu e3) {
                this.f21634c.f21613b = 11;
                throw e3;
            }
        } else {
            this.f21634c.f21613b = 2;
            throw new NullPointerException("Null payload");
        }
    }

    /* renamed from: a */
    public final SignedBlob mo13328a(byte[] bArr, String str, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("Null keyHandle");
        } else if (bArr2 != null) {
            try {
                try {
                    PrivateKey d = ehv.m10474d(this.f21632a.mo13218a(bArr).f21638c);
                    Signature instance = Signature.getInstance(str);
                    instance.initSign(d);
                    instance.update(bArr2);
                    return new SignedBlob(instance.sign());
                } catch (InvalidKeySpecException e) {
                    this.f21634c.f21613b = 3;
                    throw new iqs(e);
                } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e2) {
                    this.f21634c.f21613b = 8;
                    throw new iqs(e2);
                }
            } catch (isu e3) {
                this.f21634c.f21613b = 11;
                throw e3;
            }
        } else {
            throw new NullPointerException("Null data");
        }
    }

    /* renamed from: a */
    public final SecretKey mo13329a(String str, Account account, ClientPublicKey clientPublicKey) {
        try {
            try {
                try {
                    return ehv.m10463a(ehv.m10471b(this.f21632a.mo13221b(str, account).f21638c), ehv.m10462a(clientPublicKey.f10515b));
                } catch (InvalidKeyException e) {
                    this.f21634c.f21613b = 9;
                    throw new iqs(e);
                }
            } catch (InvalidKeySpecException e2) {
                this.f21634c.f21613b = 3;
                throw new iqs(e2);
            }
        } catch (InvalidKeySpecException e3) {
            this.f21634c.f21613b = 3;
            throw new iqs(e3);
        } catch (isu e4) {
            this.f21634c.f21613b = 11;
            throw e4;
        }
    }
}
