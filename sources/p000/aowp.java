package p000;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SyncResult;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;

/* renamed from: aowp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aowp {

    /* renamed from: a */
    public final aowg f83764a;

    /* renamed from: b */
    public final aowa f83765b;

    /* renamed from: c */
    public final ClientContext f83766c;

    /* renamed from: d */
    public final aosi f83767d;

    /* renamed from: e */
    public final ContentResolver f83768e;

    /* renamed from: f */
    public final SyncResult f83769f;

    /* renamed from: g */
    public final blrk f83770g;

    /* renamed from: h */
    public final Context f83771h;

    public aowp(Context context, aowg aowg, aowa aowa, ClientContext clientContext, aosi aosi, SyncResult syncResult) {
        this.f83764a = aowg;
        this.f83765b = aowa;
        this.f83766c = clientContext;
        this.f83767d = aosi;
        this.f83768e = context.getContentResolver();
        this.f83769f = syncResult;
        this.f83771h = context;
        this.f83770g = m69706a(context);
    }

    /* renamed from: a */
    public static blrk m69706a(Context context) {
        return aowf.m69690a(context, null, true);
    }

    /* renamed from: a */
    public static blrk m69707a(Context context, blrk blrk) {
        return aowf.m69690a(context, blrk != null ? blrk.f127486c : null, true);
    }

    /* renamed from: a */
    public final bxxc mo46962a(int i, byte[] bArr, aowi aowi) {
        switch (i) {
            case 0:
                bxvd da = blpf.f127211d.mo74144da();
                da.mo73635b(bArr, bxus.m123744c());
                Context context = this.f83771h;
                blrk blrk = ((blpf) da.f164949b).f127214b;
                if (blrk == null) {
                    blrk = blrk.f127482d;
                }
                blrk a = m69707a(context, blrk);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blpf blpf = (blpf) da.f164949b;
                a.getClass();
                blpf.f127214b = a;
                blpf.f127213a |= 1;
                if (aowi != null) {
                    bxvd bxvd = aowi.f83762e;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bloz bloz = (bloz) bxvd.f164949b;
                    blpf blpf2 = (blpf) da.mo74062i();
                    bloz bloz2 = bloz.f127169m;
                    blpf2.getClass();
                    bloz.f127173c = blpf2;
                    bloz.f127171a |= 2;
                    blrk blrk2 = ((blpf) da.f164949b).f127214b;
                    if (blrk2 == null) {
                        blrk2 = blrk.f127482d;
                    }
                    aowi.f83758a = blrk2;
                    aowi.f83759b++;
                }
                return da.mo74062i();
            case 1:
                blpo blpo = (blpo) GeneratedMessageLite.m124016a(blpo.f127258h, bArr, bxus.m123744c());
                bxvd bxvd2 = (bxvd) blpo.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) blpo);
                Context context2 = this.f83771h;
                blrk blrk3 = ((blpo) bxvd2.f164949b).f127261b;
                if (blrk3 == null) {
                    blrk3 = blrk.f127482d;
                }
                blrk a2 = m69707a(context2, blrk3);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                blpo blpo2 = (blpo) bxvd2.f164949b;
                a2.getClass();
                blpo2.f127261b = a2;
                blpo2.f127260a |= 1;
                if (aowi != null) {
                    bxvd bxvd3 = aowi.f83762e;
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    bloz bloz3 = (bloz) bxvd3.f164949b;
                    blpo blpo3 = (blpo) bxvd2.mo74062i();
                    bloz bloz4 = bloz.f127169m;
                    blpo3.getClass();
                    bloz3.f127175e = blpo3;
                    bloz3.f127171a |= 8;
                    blrk blrk4 = ((blpo) bxvd2.f164949b).f127261b;
                    if (blrk4 == null) {
                        blrk4 = blrk.f127482d;
                    }
                    aowi.f83758a = blrk4;
                    aowi.f83760c++;
                }
                return bxvd2.mo74062i();
            case 2:
                blpm blpm = (blpm) GeneratedMessageLite.m124016a(blpm.f127244g, bArr, bxus.m123744c());
                bxvd bxvd4 = (bxvd) blpm.mo74142c(5);
                bxvd4.mo73625a((GeneratedMessageLite) blpm);
                Context context3 = this.f83771h;
                blrk blrk5 = ((blpm) bxvd4.f164949b).f127247b;
                if (blrk5 == null) {
                    blrk5 = blrk.f127482d;
                }
                blrk a3 = m69707a(context3, blrk5);
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                blpm blpm2 = (blpm) bxvd4.f164949b;
                a3.getClass();
                blpm2.f127247b = a3;
                blpm2.f127246a |= 1;
                if (aowi != null) {
                    bxvd bxvd5 = aowi.f83762e;
                    if (bxvd5.f164950c) {
                        bxvd5.mo74035c();
                        bxvd5.f164950c = false;
                    }
                    bloz bloz5 = (bloz) bxvd5.f164949b;
                    blpm blpm3 = (blpm) bxvd4.mo74062i();
                    bloz bloz6 = bloz.f127169m;
                    blpm3.getClass();
                    bloz5.f127176f = blpm3;
                    bloz5.f127171a |= 16;
                    blrk blrk6 = ((blpm) bxvd4.f164949b).f127247b;
                    if (blrk6 == null) {
                        blrk6 = blrk.f127482d;
                    }
                    aowi.f83758a = blrk6;
                    aowi.f83760c++;
                }
                return bxvd4.mo74062i();
            case 3:
                bxvd da2 = blpu.f127295d.mo74144da();
                da2.mo73635b(bArr, bxus.m123744c());
                Context context4 = this.f83771h;
                blrk blrk7 = ((blpu) da2.f164949b).f127298b;
                if (blrk7 == null) {
                    blrk7 = blrk.f127482d;
                }
                blrk a4 = m69707a(context4, blrk7);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blpu blpu = (blpu) da2.f164949b;
                a4.getClass();
                blpu.f127298b = a4;
                blpu.f127297a |= 1;
                if (aowi != null) {
                    bxvd bxvd6 = aowi.f83762e;
                    if (bxvd6.f164950c) {
                        bxvd6.mo74035c();
                        bxvd6.f164950c = false;
                    }
                    bloz bloz7 = (bloz) bxvd6.f164949b;
                    blpu blpu2 = (blpu) da2.mo74062i();
                    bloz bloz8 = bloz.f127169m;
                    blpu2.getClass();
                    bloz7.f127177g = blpu2;
                    bloz7.f127171a |= 32;
                    blrk blrk8 = ((blpu) da2.f164949b).f127298b;
                    if (blrk8 == null) {
                        blrk8 = blrk.f127482d;
                    }
                    aowi.f83758a = blrk8;
                    aowi.f83761d++;
                }
                return da2.mo74062i();
            case 4:
                bxvd da3 = blps.f127286e.mo74144da();
                da3.mo73635b(bArr, bxus.m123744c());
                Context context5 = this.f83771h;
                blrk blrk9 = ((blps) da3.f164949b).f127289b;
                if (blrk9 == null) {
                    blrk9 = blrk.f127482d;
                }
                blrk a5 = m69707a(context5, blrk9);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                blps blps = (blps) da3.f164949b;
                a5.getClass();
                blps.f127289b = a5;
                blps.f127288a |= 1;
                if (aowi != null) {
                    bxvd bxvd7 = aowi.f83762e;
                    if (bxvd7.f164950c) {
                        bxvd7.mo74035c();
                        bxvd7.f164950c = false;
                    }
                    bloz bloz9 = (bloz) bxvd7.f164949b;
                    blps blps2 = (blps) da3.mo74062i();
                    bloz bloz10 = bloz.f127169m;
                    blps2.getClass();
                    bloz9.f127178h = blps2;
                    bloz9.f127171a |= 64;
                    blrk blrk10 = ((blps) da3.f164949b).f127289b;
                    if (blrk10 == null) {
                        blrk10 = blrk.f127482d;
                    }
                    aowi.f83758a = blrk10;
                    aowi.f83761d++;
                }
                return da3.mo74062i();
            case 5:
                bxvd da4 = blru.f127527g.mo74144da();
                da4.mo73635b(bArr, bxus.m123744c());
                Context context6 = this.f83771h;
                blrk blrk11 = ((blru) da4.f164949b).f127530b;
                if (blrk11 == null) {
                    blrk11 = blrk.f127482d;
                }
                blrk a6 = m69707a(context6, blrk11);
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                blru blru = (blru) da4.f164949b;
                a6.getClass();
                blru.f127530b = a6;
                blru.f127529a |= 1;
                if (aowi != null) {
                    bxvd bxvd8 = aowi.f83762e;
                    if (bxvd8.f164950c) {
                        bxvd8.mo74035c();
                        bxvd8.f164950c = false;
                    }
                    bloz bloz11 = (bloz) bxvd8.f164949b;
                    blru blru2 = (blru) da4.mo74062i();
                    bloz bloz12 = bloz.f127169m;
                    blru2.getClass();
                    bloz11.f127181k = blru2;
                    bloz11.f127171a |= 512;
                    blrk blrk12 = ((blru) da4.f164949b).f127530b;
                    if (blrk12 == null) {
                        blrk12 = blrk.f127482d;
                    }
                    aowi.f83758a = blrk12;
                    aowi.f83759b++;
                }
                return da4.mo74062i();
            case 6:
                bxvd da5 = blro.f127492g.mo74144da();
                da5.mo73635b(bArr, bxus.m123744c());
                Context context7 = this.f83771h;
                blrk blrk13 = ((blro) da5.f164949b).f127495b;
                if (blrk13 == null) {
                    blrk13 = blrk.f127482d;
                }
                blrk a7 = m69707a(context7, blrk13);
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                blro blro = (blro) da5.f164949b;
                a7.getClass();
                blro.f127495b = a7;
                blro.f127494a |= 1;
                if (aowi != null) {
                    bxvd bxvd9 = aowi.f83762e;
                    if (bxvd9.f164950c) {
                        bxvd9.mo74035c();
                        bxvd9.f164950c = false;
                    }
                    bloz bloz13 = (bloz) bxvd9.f164949b;
                    blro blro2 = (blro) da5.mo74062i();
                    bloz bloz14 = bloz.f127169m;
                    blro2.getClass();
                    bloz13.f127182l = blro2;
                    bloz13.f127171a |= 1024;
                    blrk blrk14 = ((blro) da5.f164949b).f127495b;
                    if (blrk14 == null) {
                        blrk14 = blrk.f127482d;
                    }
                    aowi.f83758a = blrk14;
                    aowi.f83759b++;
                }
                return da5.mo74062i();
            case 7:
                bxvd da6 = blqn.f127372g.mo74144da();
                da6.mo73635b(bArr, bxus.m123744c());
                Context context8 = this.f83771h;
                blrk blrk15 = ((blqn) da6.f164949b).f127375b;
                if (blrk15 == null) {
                    blrk15 = blrk.f127482d;
                }
                blrk a8 = m69707a(context8, blrk15);
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                blqn blqn = (blqn) da6.f164949b;
                a8.getClass();
                blqn.f127375b = a8;
                blqn.f127374a |= 1;
                if (aowi != null) {
                    bxvd bxvd10 = aowi.f83762e;
                    if (bxvd10.f164950c) {
                        bxvd10.mo74035c();
                        bxvd10.f164950c = false;
                    }
                    bloz bloz15 = (bloz) bxvd10.f164949b;
                    blqn blqn2 = (blqn) da6.mo74062i();
                    bloz bloz16 = bloz.f127169m;
                    blqn2.getClass();
                    bloz15.f127180j = blqn2;
                    bloz15.f127171a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    blrk blrk16 = ((blqn) da6.f164949b).f127375b;
                    if (blrk16 == null) {
                        blrk16 = blrk.f127482d;
                    }
                    aowi.f83758a = blrk16;
                    aowi.f83759b++;
                }
                return da6.mo74062i();
            case 8:
                bxvd da7 = blql.f127360g.mo74144da();
                da7.mo73635b(bArr, bxus.m123744c());
                Context context9 = this.f83771h;
                blrk blrk17 = ((blql) da7.f164949b).f127363b;
                if (blrk17 == null) {
                    blrk17 = blrk.f127482d;
                }
                blrk a9 = m69707a(context9, blrk17);
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                blql blql = (blql) da7.f164949b;
                a9.getClass();
                blql.f127363b = a9;
                blql.f127362a |= 1;
                if (aowi != null) {
                    bxvd bxvd11 = aowi.f83762e;
                    if (bxvd11.f164950c) {
                        bxvd11.mo74035c();
                        bxvd11.f164950c = false;
                    }
                    bloz bloz17 = (bloz) bxvd11.f164949b;
                    blql blql2 = (blql) da7.mo74062i();
                    bloz bloz18 = bloz.f127169m;
                    blql2.getClass();
                    bloz17.f127179i = blql2;
                    bloz17.f127171a |= 128;
                    blrk blrk18 = ((blql) da7.f164949b).f127363b;
                    if (blrk18 == null) {
                        blrk18 = blrk.f127482d;
                    }
                    aowi.f83758a = blrk18;
                    aowi.f83759b++;
                }
                return da7.mo74062i();
            case 9:
                bxvd da8 = blph.f127219h.mo74144da();
                da8.mo73635b(bArr, bxus.m123744c());
                Context context10 = this.f83771h;
                blrk blrk19 = ((blph) da8.f164949b).f127222b;
                if (blrk19 == null) {
                    blrk19 = blrk.f127482d;
                }
                blrk a10 = m69707a(context10, blrk19);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                blph blph = (blph) da8.f164949b;
                a10.getClass();
                blph.f127222b = a10;
                blph.f127221a |= 1;
                if (aowi != null) {
                    bxvd bxvd12 = aowi.f83762e;
                    if (bxvd12.f164950c) {
                        bxvd12.mo74035c();
                        bxvd12.f164950c = false;
                    }
                    bloz bloz19 = (bloz) bxvd12.f164949b;
                    blph blph2 = (blph) da8.mo74062i();
                    bloz bloz20 = bloz.f127169m;
                    blph2.getClass();
                    bloz19.f127174d = blph2;
                    bloz19.f127171a |= 4;
                    blrk blrk20 = ((blph) da8.f164949b).f127222b;
                    if (blrk20 == null) {
                        blrk20 = blrk.f127482d;
                    }
                    aowi.f83758a = blrk20;
                    aowi.f83759b++;
                }
                return da8.mo74062i();
            case 10:
                bxvd da9 = blpd.f127200d.mo74144da();
                da9.mo73635b(bArr, bxus.m123744c());
                Context context11 = this.f83771h;
                blrk blrk21 = ((blpd) da9.f164949b).f127203b;
                if (blrk21 == null) {
                    blrk21 = blrk.f127482d;
                }
                blrk a11 = m69707a(context11, blrk21);
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                blpd blpd = (blpd) da9.f164949b;
                a11.getClass();
                blpd.f127203b = a11;
                blpd.f127202a |= 1;
                if (aowi != null) {
                    bxvd bxvd13 = aowi.f83762e;
                    if (bxvd13.f164950c) {
                        bxvd13.mo74035c();
                        bxvd13.f164950c = false;
                    }
                    bloz bloz21 = (bloz) bxvd13.f164949b;
                    blpd blpd2 = (blpd) da9.mo74062i();
                    bloz bloz22 = bloz.f127169m;
                    blpd2.getClass();
                    bloz21.f127172b = blpd2;
                    bloz21.f127171a |= 1;
                    blrk blrk22 = ((blpd) da9.f164949b).f127203b;
                    if (blrk22 == null) {
                        blrk22 = blrk.f127482d;
                    }
                    aowi.f83758a = blrk22;
                    aowi.f83759b += ((blpd) da9.f164949b).f127204c.size();
                }
                return da9.mo74062i();
            case 11:
                return (blrh) GeneratedMessageLite.m124016a(blrh.f127450b, bArr, bxus.m123744c());
            default:
                try {
                    StringBuilder sb = new StringBuilder(29);
                    sb.append("Unknown operation:");
                    sb.append(i);
                    aowu.m69733a("RemindersSync", sb.toString(), new Object[0]);
                    return null;
                } catch (bxwf e) {
                    return null;
                }
        }
    }

    /* renamed from: a */
    public final void mo46963a() {
        boolean madeSomeProgress = this.f83769f.madeSomeProgress();
        boolean a = aowt.m69730a(this.f83771h, ContentUris.withAppendedId(aosy.f83568a, this.f83767d.f83507a), "was_last_sync_error");
        aowu.m69733a("RemindersSync", "UpSync failed, madeSomeProgress: %b, wasLastSyncError: %b", Boolean.valueOf(this.f83769f.madeSomeProgress()), Boolean.valueOf(a));
        new Object[1][0] = this.f83767d.f83508b.name;
        if (madeSomeProgress && a) {
            aowf.m69693a(this.f83767d);
            return;
        }
        this.f83769f.stats.numIoExceptions++;
    }

    /* renamed from: a */
    public final void mo46964a(long j) {
        this.f83768e.delete(ContentUris.withAppendedId(aota.f83571a, j), null, null);
    }

    /* renamed from: a */
    public final void mo46965a(blox blox) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContentProviderOperation.newUpdate(aotd.f83574a).withSelection("client_assigned_id=? AND account_id=?", new String[]{blox.f127163b, String.valueOf(this.f83767d.f83507a)}).withValue("deleted", 1).build());
        String str = blox.f127163b;
        bxvd da = blqh.f127336d.mo74144da();
        blrk blrk = this.f83770g;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blqh blqh = (blqh) da.f164949b;
        blrk.getClass();
        blqh.f127339b = blrk;
        blqh.f127338a |= 1;
        bxvd da2 = blox.f127160d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blox blox2 = (blox) da2.f164949b;
        str.getClass();
        blox2.f127162a = 2 | blox2.f127162a;
        blox2.f127163b = str;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blqh blqh2 = (blqh) da.f164949b;
        blox blox3 = (blox) da2.mo74062i();
        blox3.getClass();
        blqh2.mo66689a();
        blqh2.f127340c.add(blox3);
        blrj blrj = null;
        try {
            blqi a = this.f83764a.mo46958a(this.f83766c, (blqh) da.mo74062i());
            if (a.f127343a.size() > 0) {
                blrj = (blrj) a.f127343a.get(0);
            }
        } catch (chuw e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("NetworkError when getting task:");
            sb.append(valueOf);
            aowu.m69733a("RemindersSync", sb.toString(), new Object[0]);
        } catch (gid e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
            sb2.append("GoogleAuthException when getting task:");
            sb2.append(valueOf2);
            aowu.m69733a("RemindersSync", sb2.toString(), new Object[0]);
        }
        if (blrj != null) {
            ContentValues contentValues = new ContentValues();
            aowy.m69767a(contentValues, blrj);
            contentValues.put("account_id", Long.valueOf(this.f83767d.f83507a));
            arrayList.add(ContentProviderOperation.newInsert(aotd.f83575b).withValues(contentValues).build());
        }
        sgq.m35236a(this.f83768e, arrayList, "RemindersSync");
    }

    /* renamed from: a */
    public final boolean mo46966a(long j, int i) {
        int i2 = i + 1;
        if (i2 >= ((Integer) aoss.f83564w.mo58455c()).intValue()) {
            return true;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("error_count", Integer.valueOf(i2));
        this.f83768e.update(ContentUris.withAppendedId(aota.f83571a, j), contentValues, null, null);
        return false;
    }
}
