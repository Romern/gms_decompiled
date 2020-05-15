package com.google.android.gms.common.download;

import android.app.DownloadManager;
import android.content.Intent;
import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.IntentOperation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DownloadCompleteIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final srn f30174a = srn.m36126a("DownloadCompleteIntOp", sgj.DOWNLOAD);

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0131 A[SYNTHETIC, Splitter:B:65:0x0131] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0136 A[Catch:{ IOException -> 0x0141 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013d A[Catch:{ IOException -> 0x0141 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0145 A[Catch:{ IOException -> 0x0141 }] */
    public final void onHandleIntent(Intent intent) {
        DownloadDetails a;
        FileOutputStream fileOutputStream;
        File file;
        rzz.m34729a("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction()));
        long longExtra = intent.getLongExtra("extra_download_id", -1);
        if (longExtra != -1 && (a = ryd.m34637a(this, longExtra)) != null) {
            DownloadManager downloadManager = (DownloadManager) getSystemService("download");
            Cursor a2 = ryd.m34634a(downloadManager, new DownloadManager.Query().setFilterById(longExtra));
            if (a2 != null) {
                try {
                    if (a2.getCount() != 0) {
                        if (!a2.moveToFirst() || a2.getInt(a2.getColumnIndexOrThrow("status")) == 8) {
                            a2.close();
                            try {
                                ParcelFileDescriptor openDownloadedFile = downloadManager.openDownloadedFile(longExtra);
                                if (openDownloadedFile != null) {
                                    ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = null;
                                    try {
                                        if (a.f30179e != null) {
                                            file = new File(getFilesDir(), a.f30179e);
                                        } else {
                                            file = new File(rye.m34651b(this));
                                        }
                                        if (!file.exists()) {
                                            file.mkdirs();
                                        }
                                        File file2 = new File(file, a.f30175a);
                                        File file3 = new File(String.valueOf(file2.getAbsolutePath()).concat(".tmp"));
                                        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream2 = new ParcelFileDescriptor.AutoCloseInputStream(openDownloadedFile);
                                        try {
                                            fileOutputStream = new FileOutputStream(file3);
                                        } catch (IOException e) {
                                            fileOutputStream = null;
                                            autoCloseInputStream = autoCloseInputStream2;
                                            try {
                                                ryd.m34640a(this, a.f30175a);
                                                if (autoCloseInputStream != null) {
                                                    autoCloseInputStream.close();
                                                }
                                                if (fileOutputStream != null) {
                                                    fileOutputStream.close();
                                                }
                                                ryd.m34644b(this, longExtra);
                                                return;
                                            } catch (Throwable th) {
                                                th = th;
                                                if (autoCloseInputStream != null) {
                                                }
                                                if (fileOutputStream != null) {
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            fileOutputStream = null;
                                            autoCloseInputStream = autoCloseInputStream2;
                                            if (autoCloseInputStream != null) {
                                            }
                                            if (fileOutputStream != null) {
                                            }
                                            throw th;
                                        }
                                        try {
                                            byte[] bArr = new byte[4096];
                                            while (true) {
                                                int read = autoCloseInputStream2.read(bArr);
                                                if (read == -1) {
                                                    break;
                                                }
                                                fileOutputStream.write(bArr, 0, read);
                                            }
                                            fileOutputStream.getFD().sync();
                                            try {
                                                autoCloseInputStream2.close();
                                                fileOutputStream.close();
                                                if (!DownloadIntentOperation.m22555a(file3).equals(a.f30178d)) {
                                                    bnsl bnsl = (bnsl) f30174a.mo68388c();
                                                    bnsl.mo68432a("com.google.android.gms.common.download.DownloadCompleteIntentOperation", "a", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    bnsl.mo68405a("SHA-1 of downloaded file does not match request");
                                                    ryd.m34640a(this, a.f30175a);
                                                } else if (file3.renameTo(file2)) {
                                                    file2.setExecutable(false);
                                                    file2.setWritable(false);
                                                    ryd.m34639a(this, a);
                                                } else {
                                                    bnsl bnsl2 = (bnsl) f30174a.mo68387b();
                                                    bnsl2.mo68432a("com.google.android.gms.common.download.DownloadCompleteIntentOperation", "a", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    bnsl2.mo68405a("Failed to move file.");
                                                }
                                            } catch (IOException e2) {
                                            }
                                        } catch (IOException e3) {
                                        } catch (Throwable th3) {
                                            th = th3;
                                            autoCloseInputStream = autoCloseInputStream2;
                                            if (autoCloseInputStream != null) {
                                                autoCloseInputStream.close();
                                            }
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e4) {
                                        fileOutputStream = null;
                                        ryd.m34640a(this, a.f30175a);
                                        if (autoCloseInputStream != null) {
                                        }
                                        if (fileOutputStream != null) {
                                        }
                                        ryd.m34644b(this, longExtra);
                                        return;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fileOutputStream = null;
                                        if (autoCloseInputStream != null) {
                                        }
                                        if (fileOutputStream != null) {
                                        }
                                        throw th;
                                    }
                                    ryd.m34644b(this, longExtra);
                                    return;
                                }
                                throw new FileNotFoundException();
                            } catch (FileNotFoundException e5) {
                                ryd.m34644b(this, longExtra);
                                return;
                            } catch (SecurityException e6) {
                                bnsl bnsl3 = (bnsl) f30174a.mo68387b();
                                bnsl3.mo68437a(e6);
                                bnsl3.mo68432a("com.google.android.gms.common.download.DownloadCompleteIntentOperation", "onHandleIntent", 86, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl3.mo68405a("Caught Exception");
                                return;
                            }
                        } else {
                            ryd.m34644b(this, longExtra);
                            a2.close();
                        }
                    }
                } catch (Throwable th5) {
                    if (a2 != null) {
                        a2.close();
                    }
                    throw th5;
                }
            }
            ryd.m34644b(this, longExtra);
            if (a2 == null) {
                return;
            }
            a2.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0 A[SYNTHETIC, Splitter:B:50:0x00d0] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d8 A[Catch:{ IOException -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e1 A[SYNTHETIC, Splitter:B:60:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e9 A[Catch:{ IOException -> 0x00e5 }] */
    /* renamed from: a */
    private final boolean m22552a(ParcelFileDescriptor parcelFileDescriptor, DownloadDetails downloadDetails) {
        FileOutputStream fileOutputStream;
        File file;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = null;
        try {
            if (downloadDetails.f30179e != null) {
                file = new File(getFilesDir(), downloadDetails.f30179e);
            } else {
                file = new File(rye.m34651b(this));
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, downloadDetails.f30175a);
            File file3 = new File(String.valueOf(file2.getAbsolutePath()).concat(".tmp"));
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream2 = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            try {
                fileOutputStream = new FileOutputStream(file3);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = autoCloseInputStream2.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.getFD().sync();
                    try {
                        autoCloseInputStream2.close();
                        fileOutputStream.close();
                        if (!DownloadIntentOperation.m22555a(file3).equals(downloadDetails.f30178d)) {
                            bnsl bnsl = (bnsl) f30174a.mo68388c();
                            bnsl.mo68432a("com.google.android.gms.common.download.DownloadCompleteIntentOperation", "a", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("SHA-1 of downloaded file does not match request");
                            ryd.m34640a(this, downloadDetails.f30175a);
                            return false;
                        } else if (file3.renameTo(file2)) {
                            file2.setExecutable(false);
                            file2.setWritable(false);
                            ryd.m34639a(this, downloadDetails);
                            return true;
                        } else {
                            bnsl bnsl2 = (bnsl) f30174a.mo68387b();
                            bnsl2.mo68432a("com.google.android.gms.common.download.DownloadCompleteIntentOperation", "a", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("Failed to move file.");
                            return false;
                        }
                    } catch (IOException e) {
                        return false;
                    }
                } catch (IOException e2) {
                } catch (Throwable th) {
                    th = th;
                    autoCloseInputStream = autoCloseInputStream2;
                    if (autoCloseInputStream != null) {
                        try {
                            autoCloseInputStream.close();
                        } catch (IOException e3) {
                            return false;
                        }
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e4) {
                fileOutputStream = null;
                autoCloseInputStream = autoCloseInputStream2;
                try {
                    ryd.m34640a(this, downloadDetails.f30175a);
                    if (autoCloseInputStream != null) {
                        try {
                            autoCloseInputStream.close();
                        } catch (IOException e5) {
                            return false;
                        }
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    if (autoCloseInputStream != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                autoCloseInputStream = autoCloseInputStream2;
                if (autoCloseInputStream != null) {
                }
                if (fileOutputStream != null) {
                }
                throw th;
            }
        } catch (IOException e6) {
            fileOutputStream = null;
            ryd.m34640a(this, downloadDetails.f30175a);
            if (autoCloseInputStream != null) {
            }
            if (fileOutputStream != null) {
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            if (autoCloseInputStream != null) {
            }
            if (fileOutputStream != null) {
            }
            throw th;
        }
    }
}
