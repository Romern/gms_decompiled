package p000;

import android.app.backup.FullBackupDataOutput;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: mhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mhf {

    /* renamed from: d */
    private static final lvn f33713d = new lvn("TelephonyHelper");

    /* renamed from: a */
    public final Context f33714a;

    /* renamed from: b */
    public final mhd f33715b;

    /* renamed from: c */
    public bxvd f33716c;

    /* renamed from: e */
    private final mad f33717e;

    public mhf(Context context) {
        this.f33714a = context;
        this.f33717e = new mad(context, context.getPackageManager());
        this.f33715b = new mhd(context);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final int mo20011a(Cursor cursor) {
        if (cursor != null) {
            try {
                int count = cursor.getCount();
                srz.m36171a(cursor);
                return count;
            } catch (SQLException e) {
                srz.m36171a(cursor);
                return -2;
            } catch (Throwable th) {
                srz.m36171a(cursor);
                throw th;
            }
        } else {
            srz.m36171a((Closeable) null);
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo20012a(File file) {
        mad.m24752a(this.f33714a, file);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:80:0x0234=Splitter:B:80:0x0234, B:50:0x01cf=Splitter:B:50:0x01cf} */
    /* renamed from: a */
    public final void mo20013a(File file, mhe mhe) {
        FileOutputStream fileOutputStream;
        ParcelFileDescriptor parcelFileDescriptor;
        Cursor cursor;
        Cursor cursor2;
        String str;
        String str2;
        Cursor cursor3;
        File a = mce.m24857a(this.f33714a, file.getName());
        FileOutputStream fileOutputStream2 = null;
        r4 = null;
        Cursor cursor4 = null;
        r4 = null;
        Cursor cursor5 = null;
        r4 = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        try {
            fileOutputStream = new FileOutputStream(a);
            try {
                parcelFileDescriptor = ParcelFileDescriptor.dup(fileOutputStream.getFD());
                try {
                    File a2 = mce.m24857a(this.f33714a, "_manifest");
                    int i = 1;
                    f33713d.mo25412b("Writing manifest to %s", a2.getPath());
                    this.f33717e.mo19798a(a2);
                    int i2 = Build.VERSION.SDK_INT;
                    FullBackupDataOutput fullBackupDataOutput = (FullBackupDataOutput) Class.forName("android.app.backup.FullBackupDataOutput").getConstructor(ParcelFileDescriptor.class).newInstance(parcelFileDescriptor);
                    mad.m24757b("com.android.providers.telephony", null, a2.getParent(), a2.getAbsolutePath(), fullBackupDataOutput);
                    try {
                        Cursor a3 = ((mhd) mhe).mo20008a();
                        try {
                            cursor4 = ((mhd) mhe).mo20010b();
                            if (a3 != null) {
                                mhd.m25101a(a3, ((mhd) mhe).f33698g);
                            }
                            if (cursor4 != null) {
                                mhd.m25101a(cursor4, ((mhd) mhe).f33699h);
                            }
                            ((mhd) mhe).f33701j = 0;
                            ((mhd) mhe).f33702k = 0;
                            int i3 = 0;
                            while (true) {
                                str = "%06d_sms_backup";
                                if (a3 != null) {
                                    if (!a3.isAfterLast()) {
                                        if (cursor4 != null) {
                                            if (cursor4.isAfterLast()) {
                                                str2 = "%06d_mms_backup";
                                                break;
                                            }
                                            String str3 = "%06d_mms_backup";
                                            if (TimeUnit.MILLISECONDS.toSeconds(mhd.m25099a(a3)) >= mhd.m25099a(cursor4)) {
                                                long nanoTime = System.nanoTime();
                                                ((mhd) mhe).mo20009a(fullBackupDataOutput, cursor4, String.format(Locale.US, str3, Integer.valueOf(i3)));
                                                ((mhd) mhe).f33702k += TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                                                i3++;
                                            } else {
                                                long nanoTime2 = System.nanoTime();
                                                ((mhd) mhe).mo20009a(fullBackupDataOutput, a3, String.format(Locale.US, str, Integer.valueOf(i3)));
                                                ((mhd) mhe).f33701j += TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime2);
                                                i3++;
                                            }
                                        } else {
                                            str2 = "%06d_mms_backup";
                                            break;
                                        }
                                    } else {
                                        str2 = "%06d_mms_backup";
                                        break;
                                    }
                                } else {
                                    str2 = "%06d_mms_backup";
                                    break;
                                }
                            }
                            while (true) {
                                if (a3 != null) {
                                    if (a3.isAfterLast()) {
                                        cursor3 = a3;
                                        break;
                                    }
                                    long nanoTime3 = System.nanoTime();
                                    Locale locale = Locale.US;
                                    Object[] objArr = new Object[i];
                                    int i4 = i3 + 1;
                                    objArr[0] = Integer.valueOf(i3);
                                    ((mhd) mhe).mo20009a(fullBackupDataOutput, a3, String.format(locale, str, objArr));
                                    cursor2 = a3;
                                    try {
                                        ((mhd) mhe).f33701j += TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime3);
                                        a3 = cursor2;
                                        str = str;
                                        i3 = i4;
                                        i = 1;
                                    } catch (IOException e) {
                                        e = e;
                                        cursor = cursor4;
                                        cursor5 = cursor2;
                                        try {
                                            throw new mae("Error backing up telephony data.", e);
                                        } catch (Throwable th) {
                                            th = th;
                                            srz.m36171a(cursor5);
                                            srz.m36171a(cursor);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = cursor4;
                                        cursor5 = cursor2;
                                        srz.m36171a(cursor5);
                                        srz.m36171a(cursor);
                                        throw th;
                                    }
                                } else {
                                    cursor3 = a3;
                                    break;
                                }
                            }
                            while (true) {
                                if (cursor4 == null) {
                                    break;
                                } else if (!cursor4.isAfterLast()) {
                                    long nanoTime4 = System.nanoTime();
                                    int i5 = i3 + 1;
                                    ((mhd) mhe).mo20009a(fullBackupDataOutput, cursor4, String.format(Locale.US, str2, Integer.valueOf(i3)));
                                    String str4 = str2;
                                    ((mhd) mhe).f33702k += TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime4);
                                    str2 = str4;
                                    i3 = i5;
                                }
                            }
                            srz.m36171a(cursor3);
                            srz.m36171a(cursor4);
                            ((mhd) mhe).f33700i = new HashMap();
                            a2.delete();
                            fileOutputStream.write(new byte[4]);
                            srz.m36170a(parcelFileDescriptor);
                            srz.m36171a(fileOutputStream);
                            f33713d.mo25412b("Writing backup to %s", file.getPath());
                            try {
                                this.f33717e.mo19799a(a, file);
                                a.delete();
                            } catch (IOException e2) {
                                throw new mae("Error calling fullBackup.", e2);
                            } catch (Throwable th3) {
                                a.delete();
                                throw th3;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            cursor2 = a3;
                            cursor = cursor4;
                            cursor5 = cursor2;
                            throw new mae("Error backing up telephony data.", e);
                        } catch (Throwable th4) {
                            th = th4;
                            cursor2 = a3;
                            cursor = cursor4;
                            cursor5 = cursor2;
                            srz.m36171a(cursor5);
                            srz.m36171a(cursor);
                            throw th;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        cursor = null;
                        throw new mae("Error backing up telephony data.", e);
                    } catch (Throwable th5) {
                        th = th5;
                        cursor = null;
                        srz.m36171a(cursor5);
                        srz.m36171a(cursor);
                        throw th;
                    }
                } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e5) {
                    e = e5;
                    fileOutputStream2 = fileOutputStream;
                    try {
                        throw new mae("Error calling fullBackup.", e);
                    } catch (Throwable th6) {
                        th = th6;
                        fileOutputStream = fileOutputStream2;
                        parcelFileDescriptor2 = parcelFileDescriptor;
                        srz.m36170a(parcelFileDescriptor2);
                        srz.m36171a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    srz.m36170a(parcelFileDescriptor2);
                    srz.m36171a(fileOutputStream);
                    throw th;
                }
            } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e6) {
                e = e6;
                parcelFileDescriptor = null;
                fileOutputStream2 = fileOutputStream;
                throw new mae("Error calling fullBackup.", e);
            } catch (Throwable th8) {
                th = th8;
                srz.m36170a(parcelFileDescriptor2);
                srz.m36171a(fileOutputStream);
                throw th;
            }
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
            e = e7;
            parcelFileDescriptor = null;
            throw new mae("Error calling fullBackup.", e);
        } catch (Throwable th9) {
            th = th9;
            fileOutputStream = null;
            srz.m36170a(parcelFileDescriptor2);
            srz.m36171a(fileOutputStream);
            throw th;
        }
    }
}
