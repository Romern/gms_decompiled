package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.backup.ParcelableBackupDataInput;
import com.google.android.gms.backup.ParcelableBackupDataOutput;
import com.google.android.gms.romanesco.service.RomanescoModuleBackupAgentService;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* renamed from: lul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lul extends dck implements lum {

    /* renamed from: a */
    private final aozc f32999a;

    /* renamed from: b */
    private final aoza f33000b;

    /* renamed from: c */
    private final lsp f33001c;

    /* renamed from: d */
    private final Context f33002d;

    public lul() {
        super("com.google.android.gms.backup.IChimeraModuleBackupAgent");
    }

    /* renamed from: a */
    private static Pair m24422a(List list, Account account) {
        int size = list.size();
        String str = null;
        Long l = null;
        btel btel = null;
        boolean z = false;
        for (int i = 0; i < size; i++) {
            lsu lsu = (lsu) list.get(i);
            aoyh aoyh = RomanescoModuleBackupAgentService.f107313a;
            Object[] objArr = {lsu.mo19580a(), new String(bqce.m112561a(lsu.mo19582c()))};
            if ("device_id".equals(lsu.mo19580a())) {
                List c = lsu.mo19582c();
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.put(bqce.m112561a(c));
                allocate.flip();
                l = Long.valueOf(allocate.getLong());
                Object[] objArr2 = {account, l};
            } else if ("contacts_backup_key_q".equals(lsu.mo19580a())) {
                RomanescoModuleBackupAgentService.f107313a.mo46981b("Contacts backup found");
                btel = (btel) btem.f148532c.mo74144da();
                btel.mo73635b(bqce.m112561a(lsu.mo19582c()), bxus.m123744c());
                z = true;
            }
        }
        if (z) {
            if (l != null) {
                str = Long.toString(l.longValue());
            }
            return new Pair(str, (btem) btel.mo74062i());
        }
        throw new RemoteException("Required contact backup not found in selected backup.");
    }

    /* renamed from: b */
    private static void m24428b(int i, int i2, int i3) {
        bxvd da = bzeg.f169639g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bzeg) da.f164949b).f169641a = bzef.m125712a(3);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzeg bzeg = (bzeg) da.f164949b;
        bzeg.f169642b = i;
        bzeg.f169643c = i2;
        bzeg.f169645e = bzee.m125711a(i3);
        aoyj.m69819a().mo46994a((bzeg) da.mo74062i());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lul(Context context) {
        super("com.google.android.gms.backup.IChimeraModuleBackupAgent");
        lsp lsp = new lsp(context);
        aoza aoza = new aoza(context);
        aozc aozc = new aozc(context, 3);
        this.f33001c = lsp;
        this.f33000b = aoza;
        this.f32999a = aozc;
        this.f33002d = context;
    }

    /* renamed from: b */
    private final void m24429b(List list, Account account) {
        try {
            Pair a = m24422a(list, account);
            this.f32999a.mo47033a((btem) a.second, account.name, cgjy.f187097a.mo6606a().mo83954r());
            RomanescoModuleBackupAgentService.f107313a.mo46981b("onRestore success");
            if (cgjy.m145763j()) {
                m24428b(((btem) a.second).f148534a.size(), list.size(), 4);
            }
        } catch (OperationApplicationException e) {
            m24424a(4, 7, 4);
            String valueOf = String.valueOf(e.getMessage());
            throw new RemoteException(valueOf.length() == 0 ? new String("Exception writing backup contacts to CP2: ") : "Exception writing backup contacts to CP2: ".concat(valueOf));
        }
    }

    /* renamed from: a */
    private static void m24423a() {
        bxvd da = bzed.f169634d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bzed) da.f164949b).f169636a = bzec.m125709a(4);
        aoyj.m69819a().mo46993a((bzed) da.mo74062i());
    }

    /* renamed from: a */
    private static void m24424a(int i, int i2, int i3) {
        bxvd da = bzeg.f169639g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bzeg) da.f164949b).f169641a = bzef.m125712a(i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bzeg) da.f164949b).f169644d = i2 - 2;
        ((bzeg) da.f164949b).f169645e = bzee.m125711a(i3);
        aoyj.m69819a().mo46994a((bzeg) da.mo74062i());
    }

    /* renamed from: a */
    private static void m24425a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new RemoteException(valueOf.length() == 0 ? new String("Cannot close ParcelFileDescriptor: ") : "Cannot close ParcelFileDescriptor: ".concat(valueOf));
        }
    }

    /* renamed from: a */
    private static void m24426a(ParcelableBackupDataInput parcelableBackupDataInput) {
        try {
            parcelableBackupDataInput.close();
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new RemoteException(valueOf.length() == 0 ? new String("Cannot close ParcelableBackupDataInput: ") : "Cannot close ParcelableBackupDataInput: ".concat(valueOf));
        }
    }

    /* renamed from: a */
    private static void m24427a(ParcelableBackupDataOutput parcelableBackupDataOutput) {
        try {
            parcelableBackupDataOutput.close();
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new RemoteException(valueOf.length() == 0 ? new String("Cannot close ParcelableBackupDataOutput: ") : "Cannot close ParcelableBackupDataOutput: ".concat(valueOf));
        }
    }

    /* renamed from: a */
    public final void mo19611a(ParcelFileDescriptor parcelFileDescriptor, ParcelableBackupDataOutput parcelableBackupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        try {
            int i = Build.VERSION.SDK_INT;
            if (!cgjy.m145759f()) {
                RomanescoModuleBackupAgentService.f107313a.mo46981b("onBackup called but it is disabled.");
                if (cgjy.m145762i()) {
                    bxvd da = bzed.f169634d.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((bzed) da.f164949b).f169636a = bzec.m125709a(5);
                    aoyj.m69819a().mo46993a((bzed) da.mo74062i());
                }
            } else {
                RomanescoModuleBackupAgentService.f107313a.mo46981b("onBackup");
                if (cgjy.f187097a.mo6606a().mo83958v()) {
                    byte[] bytes = "romanesco_presence_backup_value".getBytes(Charset.defaultCharset());
                    parcelableBackupDataOutput.mo17212a(lsu.m24355a("romanesco_presence_backup_key_q", bytes.length, bytes));
                }
                btem a = this.f33000b.mo47025a();
                bxvd bxvd = (bxvd) a.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) a);
                btel btel = (btel) bxvd;
                bxvd da2 = btfb.f148607b.mo74144da();
                String b = bmwg.LOWER_UNDERSCORE.mo66826b(bmwg.UPPER_CAMEL, Build.MANUFACTURER.toLowerCase());
                String str = Build.MODEL;
                StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 3 + String.valueOf(str).length());
                sb.append(b);
                sb.append(" - ");
                sb.append(str);
                String sb2 = sb.toString();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                sb2.getClass();
                ((btfb) da2.f164949b).f148609a = sb2;
                if (btel.f164950c) {
                    btel.mo74035c();
                    btel.f164950c = false;
                }
                btfb btfb = (btfb) da2.mo74062i();
                btem btem = btem.f148532c;
                btfb.getClass();
                ((btem) btel.f164949b).f148535b = btfb;
                if (cgjv.f187094a.mo6606a().mo83921a()) {
                    int g = (int) cgjy.f187097a.mo6606a().mo83943g();
                    if (((btem) btel.f164949b).f148534a.size() > g) {
                        List subList = Collections.unmodifiableList(((btem) btel.f164949b).f148534a).subList(0, g);
                        if (btel.f164950c) {
                            btel.mo74035c();
                            btel.f164950c = false;
                        }
                        ((btem) btel.f164949b).f148534a = GeneratedMessageLite.m124030de();
                        btel.mo70754a(subList);
                    }
                }
                byte[] k = ((btem) btel.mo74062i()).serializeToBytes();
                int length = k.length;
                parcelableBackupDataOutput.mo17212a(lsu.m24355a("contacts_backup_key_q", length, k));
                if (cgjy.f187097a.mo6606a().mo83937a()) {
                    bmxv a2 = aoxv.m69792a(this.f33002d);
                    if (a2.mo66813a()) {
                        long longValue = ((Long) a2.mo66814b()).longValue();
                        ByteBuffer allocate = ByteBuffer.allocate(8);
                        allocate.putLong(longValue);
                        byte[] array = allocate.array();
                        parcelableBackupDataOutput.mo17212a(lsu.m24355a("device_id", array.length, array));
                    } else {
                        aoyh aoyh = RomanescoModuleBackupAgentService.f107313a;
                        String valueOf = String.valueOf(this.f33001c.mo19591a());
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 48);
                        sb3.append("Device Id not found while backup for account %s ");
                        sb3.append(valueOf);
                        aoyh.mo46985d(sb3.toString());
                    }
                }
                if (cgjy.f187097a.mo6606a().mo83946j()) {
                    RomanescoModuleBackupAgentService.f107313a.mo46981b(String.format("Backed up %d contacts in %d bytes", Integer.valueOf(((btem) btel.f164949b).f148534a.size()), Integer.valueOf(length)));
                }
                RomanescoModuleBackupAgentService.f107313a.mo46981b("onBackup success.");
                if (cgjy.m145762i()) {
                    bxvd da3 = bzed.f169634d.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    ((bzed) da3.f164949b).f169636a = bzec.m125709a(3);
                    int size = ((btem) btel.f164949b).f148534a.size();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bzed bzed = (bzed) da3.f164949b;
                    bzed.f169637b = size;
                    bzed.f169638c = length;
                    aoyj.m69819a().mo46993a((bzed) da3.mo74062i());
                }
            }
            m24427a(parcelableBackupDataOutput);
            if (parcelFileDescriptor != null) {
                m24425a(parcelFileDescriptor);
            }
            m24425a(parcelFileDescriptor2);
        } catch (IOException e) {
            if (!cgjy.m145760g()) {
                RomanescoModuleBackupAgentService.f107313a.mo46987e("Exception writing backup data", e);
            } else {
                RomanescoModuleBackupAgentService.f107313a.mo46980a(e, "Exception writing backup data");
            }
            if (cgjy.m145762i()) {
                m24423a();
            }
            String valueOf2 = String.valueOf(e.getMessage());
            throw new RemoteException(valueOf2.length() == 0 ? new String("Exception writing backup data: ") : "Exception writing backup data: ".concat(valueOf2));
        } catch (aoyu | aoyv | InterruptedException e2) {
            if (cgjy.m145762i()) {
                m24423a();
            }
            String valueOf3 = String.valueOf(e2.getMessage());
            throw new RemoteException(valueOf3.length() == 0 ? new String("Unable to read contacts from CP2: ") : "Unable to read contacts from CP2: ".concat(valueOf3));
        } catch (Throwable th) {
            m24427a(parcelableBackupDataOutput);
            if (parcelFileDescriptor != null) {
                m24425a(parcelFileDescriptor);
            }
            m24425a(parcelFileDescriptor2);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ff A[Catch:{ all -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0100 A[Catch:{ all -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0116 A[Catch:{ all -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011c A[Catch:{ all -> 0x00f6 }] */
    /* renamed from: a */
    public final void mo19612a(ParcelableBackupDataInput parcelableBackupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        int i2 = 2;
        try {
            int i3 = Build.VERSION.SDK_INT;
            if (cgjy.f187097a.mo6606a().mo83953q()) {
                Account a = this.f33001c.mo19591a();
                if (a == null) {
                    RomanescoModuleBackupAgentService.f107313a.mo46985d("onRestore called but no backup account found");
                    if (cgjy.m145763j()) {
                        m24424a(4, 6, 2);
                    }
                    throw new RemoteException("onRestore called but no backup account found");
                }
                RomanescoModuleBackupAgentService.f107313a.mo46981b("onRestore");
                List a2 = lst.m24353a(parcelableBackupDataInput.f28990a);
                if (cgkf.m145856c()) {
                    Context context = this.f33002d;
                    String str = a.name;
                    SharedPreferences a3 = aper.m70107a(context);
                    String valueOf = String.valueOf(str);
                    if (a3.getBoolean(valueOf.length() == 0 ? new String("is_restore_from_settings__") : "is_restore_from_settings__".concat(valueOf), false)) {
                        try {
                            Pair a4 = m24422a(a2, a);
                            if (bmxx.m108577a((String) a4.first)) {
                                aoyh aoyh = RomanescoModuleBackupAgentService.f107313a;
                                String valueOf2 = String.valueOf((String) a4.first);
                                aoyh.mo46985d(valueOf2.length() == 0 ? new String("Do not restore GMS backup with null / Empty device id, deviceId found : ") : "Do not restore GMS backup with null / Empty device id, deviceId found : ".concat(valueOf2));
                                if (cgjy.m145763j()) {
                                    m24424a(4, 3, 3);
                                }
                            } else {
                                apfa.f84284a.f84285b.put(new apez(a.name, (String) a4.first), (btem) a4.second);
                                if (cgjy.m145763j()) {
                                    m24428b(((btem) a4.second).f148534a.size(), a2.size(), 3);
                                }
                            }
                        } catch (IOException e) {
                            e = e;
                            i2 = 3;
                            try {
                                if (!cgjy.m145763j()) {
                                }
                                String valueOf3 = String.valueOf(e.getMessage());
                                throw new RemoteException(valueOf3.length() != 0 ? new String("Exception reading restore data: ") : "Exception reading restore data: ".concat(valueOf3));
                            } catch (Throwable th) {
                                m24426a(parcelableBackupDataInput);
                                if (parcelFileDescriptor != null) {
                                    m24425a(parcelFileDescriptor);
                                }
                                throw th;
                            }
                        }
                    }
                }
                try {
                    m24429b(a2, a);
                } catch (IOException e2) {
                    e = e2;
                    i2 = 4;
                }
            } else {
                RomanescoModuleBackupAgentService.f107313a.mo46981b("onRestore called but it is disabled.");
                if (cgjy.m145763j()) {
                    m24424a(5, 4, 2);
                }
            }
            m24426a(parcelableBackupDataInput);
            if (parcelFileDescriptor != null) {
                m24425a(parcelFileDescriptor);
            }
        } catch (IOException e3) {
            e = e3;
            if (!cgjy.m145763j()) {
                m24424a(4, 5, i2);
            }
            String valueOf32 = String.valueOf(e.getMessage());
            throw new RemoteException(valueOf32.length() != 0 ? new String("Exception reading restore data: ") : "Exception reading restore data: ".concat(valueOf32));
        }
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo19611a((ParcelFileDescriptor) dcl.m8163a(parcel, ParcelFileDescriptor.CREATOR), (ParcelableBackupDataOutput) dcl.m8163a(parcel, ParcelableBackupDataOutput.CREATOR), (ParcelFileDescriptor) dcl.m8163a(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo19612a((ParcelableBackupDataInput) dcl.m8163a(parcel, ParcelableBackupDataInput.CREATOR), parcel.readInt(), (ParcelFileDescriptor) dcl.m8163a(parcel, ParcelFileDescriptor.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
