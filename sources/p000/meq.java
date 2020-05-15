package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.app.backup.BackupDataOutput;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* renamed from: meq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class meq extends mqb {

    /* renamed from: a */
    public static final /* synthetic */ int f33530a = 0;

    /* renamed from: b */
    private static final lvn f33531b = new lvn("D2dMigrateHelper");

    /* renamed from: c */
    private final mem f33532c;

    /* renamed from: d */
    private final mes f33533d;

    /* renamed from: e */
    private final Context f33534e;

    public meq(Context context) {
        mem mem = new mem(context);
        mes mes = new mes(context);
        sdo.m34959a(context);
        this.f33534e = context;
        sdo.m34959a(mes);
        this.f33533d = mes;
        sdo.m34959a(mem);
        this.f33532c = mem;
    }

    /* renamed from: a */
    private final PendingIntent m24914a(ComponentName componentName) {
        return PendingIntent.getActivity(this.f33534e, 1, new Intent().setComponent(componentName), 134217728);
    }

    /* renamed from: b */
    public final void mo19891b(String str, mqa mqa) {
        mqa.mo20224a(mas.m24774a(str, new mfp(this.f33534e).f33588c.f33397b));
    }

    /* renamed from: c */
    public final void mo19894c(String str, mqf mqf) {
        SharedPreferences.Editor edit = lwc.m24524a(this.f33534e).f33100c.edit();
        edit.putString("ancestral_secondary_key_version", str);
        edit.apply();
        mqf.mo20226a();
    }

    /* renamed from: b */
    public final void mo19892b(String str, mqf mqf) {
        try {
            this.f33532c.mo19880b(str);
            mqf.mo20226a();
        } catch (mpz e) {
            f33531b.mo25415d("d2dFileFailure failed; calling onFailure()", e, new Object[0]);
            mqf.mo20227c();
        }
    }

    /* renamed from: a */
    public final void mo19885a(Account account, byte[] bArr, byte[] bArr2, byte[] bArr3, ComponentName componentName, mqf mqf) {
        Intent putExtra = new Intent("com.google.android.gms.auth.folsom.START_RECOVERY").setPackage("com.google.android.gms").putExtra("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT", account).putExtra("com.google.android.gms.auth.folsom.EXTRA_LSKF_HASH", bArr3).putExtra("com.google.android.gms.auth.folsom.EXTRA_VAULT_HANDLE", bArr).putExtra("com.google.android.gms.auth.folsom.EXTRA_CHALLENGE", bArr2).putExtra("com.google.android.gms.auth.folsom.EXTRA_PENDING_INTENT", m24914a(componentName));
        if (ccop.m131032b()) {
            putExtra.addFlags(268435456);
        }
        this.f33534e.sendBroadcast(putExtra);
        mqf.mo20226a();
    }

    /* renamed from: c */
    public final void mo19895c(mqf mqf) {
        FileOutputStream fileOutputStream;
        BackupDataOutput backupDataOutput;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            mes mes = this.f33533d;
            FileOutputStream fileOutputStream2 = null;
            r3 = null;
            Closeable closeable = null;
            fileOutputStream2 = null;
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(mes.f33537c.mo19847b("restore_token_file"));
                try {
                    fileOutputStream3.write("1".getBytes(StandardCharsets.UTF_8));
                    fileOutputStream3.close();
                    srz.m36171a(fileOutputStream3);
                    File b = mes.f33537c.mo19847b("@pm@");
                    b.createNewFile();
                    try {
                        fileOutputStream = new FileOutputStream(b);
                        try {
                            backupDataOutput = new BackupDataOutput(fileOutputStream.getFD());
                            byteArrayOutputStream = new ByteArrayOutputStream();
                        } catch (Throwable th) {
                            th = th;
                            srz.m36171a(closeable);
                            srz.m36171a(fileOutputStream);
                            throw th;
                        }
                        try {
                            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                            dataOutputStream.writeInt(23);
                            dataOutputStream.writeUTF("2920157");
                            dataOutputStream.flush();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            int length = byteArray.length;
                            backupDataOutput.writeEntityHeader("@meta@", length);
                            backupDataOutput.writeEntityData(byteArray, length);
                            byteArrayOutputStream.close();
                            fileOutputStream.close();
                            srz.m36171a(byteArrayOutputStream);
                            srz.m36171a(fileOutputStream);
                            try {
                                new mhf(mes.f33536b).mo20012a(b);
                            } catch (mae e) {
                                mes.f33535a.mo25417e("Failed to add telephony metadata.", e, new Object[0]);
                            }
                            mqf.mo20226a();
                        } catch (Throwable th2) {
                            th = th2;
                            closeable = byteArrayOutputStream;
                            srz.m36171a(closeable);
                            srz.m36171a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                        srz.m36171a(closeable);
                        srz.m36171a(fileOutputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream2 = fileOutputStream3;
                    try {
                        throw new mer("Error generating token file.", e);
                    } catch (Throwable th4) {
                        th = th4;
                        srz.m36171a(fileOutputStream2);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    fileOutputStream2 = fileOutputStream3;
                    srz.m36171a(fileOutputStream2);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                throw new mer("Error generating token file.", e);
            } catch (Throwable th6) {
                th = th6;
                srz.m36171a(fileOutputStream2);
                throw th;
            }
        } catch (IOException e4) {
            throw new mer("Error generating @pm@ file.", e4);
        } catch (mer e5) {
            f33531b.mo25417e("Error generating iOS restore metadata", e5, new Object[0]);
            mqf.mo20227c();
        }
    }

    /* renamed from: b */
    public final void mo19893b(mqf mqf) {
        Context context = this.f33534e;
        new mas(context, new lvp(context)).mo19813a(new mep(mqf));
    }

    /* renamed from: a */
    public final void mo19886a(Account account, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i, byte[] bArr6, ComponentName componentName, mqf mqf) {
        Intent putExtra = new Intent("com.google.android.gms.auth.folsom.START_RECOVERY").setPackage("com.google.android.gms").putExtra("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT", account).putExtra("com.google.android.gms.auth.folsom.EXTRA_LSKF_HASH", bArr2).putExtra("com.google.android.gms.auth.folsom.EXTRA_CERT_PATH", bArr3).putExtra("com.google.android.gms.auth.folsom.EXTRA_BACKEND_PUBLIC_KEY", bArr4).putExtra("com.google.android.gms.auth.folsom.EXTRA_COUNTER_ID", bArr5).putExtra("com.google.android.gms.auth.folsom.EXTRA_MAX_ATTEMPTS", i).putExtra("com.google.android.gms.auth.folsom.EXTRA_VAULT_HANDLE", bArr6).putExtra("com.google.android.gms.auth.folsom.EXTRA_CHALLENGE", bArr).putExtra("com.google.android.gms.auth.folsom.EXTRA_PENDING_INTENT", m24914a(componentName));
        if (ccop.m131032b()) {
            putExtra.addFlags(268435456);
        }
        this.f33534e.sendBroadcast(putExtra);
        mqf.mo20226a();
    }

    /* renamed from: a */
    public final void mo19887a(String str, ParcelFileDescriptor parcelFileDescriptor, mqf mqf) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        try {
            this.f33532c.mo19879a(str, autoCloseInputStream);
            srz.m36171a((Closeable) null);
            mqf.mo20226a();
        } catch (mpz e) {
            f33531b.mo25415d("d2dFileStart failed; calling onFailure()", e, new Object[0]);
            mqf.mo20227c();
            srz.m36171a((Closeable) autoCloseInputStream);
        } catch (Throwable th) {
            srz.m36171a((Closeable) autoCloseInputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo19888a(String str, mqa mqa) {
        mqa.mo20224a(this.f33532c.f33517a.mo19847b(str).exists());
    }

    /* renamed from: a */
    public final void mo19889a(String str, mqf mqf) {
        try {
            this.f33532c.mo19878a(str);
            mqf.mo20226a();
        } catch (mpz e) {
            f33531b.mo25415d("d2dFileSuccess failed; calling onFailure()", e, new Object[0]);
            mqf.mo20227c();
        }
    }

    /* renamed from: a */
    public final void mo19890a(mqf mqf) {
        f33531b.mo25414c("Responding to ping call.", new Object[0]);
        mqf.mo20226a();
    }
}
