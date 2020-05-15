package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: cen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cen implements cdt {

    /* renamed from: a */
    private final Uri f6617a;

    /* renamed from: b */
    private final cep f6618b;

    /* renamed from: c */
    private InputStream f6619c;

    public cen(Uri uri, cep cep) {
        this.f6617a = uri;
        this.f6618b = cep;
    }

    /* renamed from: a */
    public static cen m4075a(Context context, Uri uri, ceo ceo) {
        return new cen(uri, new cep(cbo.m3902a(context).f6405c.mo3661a(), ceo, cbo.m3902a(context).f6406d, context.getContentResolver()));
    }

    /* renamed from: a */
    public final Class mo3747a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public final void mo3753b() {
        InputStream inputStream = this.f6619c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: c */
    public final void mo3754c() {
    }

    /* renamed from: d */
    public final int mo3755d() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        if (r2 != null) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b A[Catch:{ NullPointerException -> 0x005b, FileNotFoundException -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0033 A[Catch:{ NullPointerException -> 0x005b, FileNotFoundException -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0034 A[Catch:{ NullPointerException -> 0x005b, FileNotFoundException -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x003b A[Catch:{ NullPointerException -> 0x005b, FileNotFoundException -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a0 A[Catch:{ NullPointerException -> 0x005b, FileNotFoundException -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c4 A[SYNTHETIC, Splitter:B:57:0x00c4] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cf A[SYNTHETIC, Splitter:B:64:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d9 A[SYNTHETIC, Splitter:B:70:0x00d9] */
    /* renamed from: a */
    public final void mo3751a(cbs cbs, cds cds) {
        Uri uri;
        String str;
        cdz cdz;
        int i;
        Uri fromFile;
        Cursor cursor;
        try {
            cep cep = this.f6618b;
            uri = this.f6617a;
            InputStream inputStream = null;
            Cursor cursor2 = null;
            inputStream = null;
            try {
                cursor = cep.f6620a.mo3779a(uri);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            str = cursor.getString(0);
                            cursor.close();
                            if (!TextUtils.isEmpty(str)) {
                                File file = new File(str);
                                if (file.exists() && file.length() > 0) {
                                    fromFile = Uri.fromFile(file);
                                    cdz = cep.f6622c.openInputStream(fromFile);
                                    if (cdz != null) {
                                        cep cep2 = this.f6618b;
                                        try {
                                            inputStream = cep2.f6622c.openInputStream(this.f6617a);
                                            try {
                                                i = cdf.m3990b(cep2.f6623d, inputStream, cep2.f6621b);
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (IOException e) {
                                                    }
                                                }
                                            } catch (IOException | NullPointerException e2) {
                                                if (inputStream != null) {
                                                }
                                                i = -1;
                                                if (i != -1) {
                                                }
                                                this.f6619c = cdz;
                                                cds.mo3762a(cdz);
                                            } catch (Throwable th) {
                                                th = th;
                                                if (inputStream != null) {
                                                }
                                                throw th;
                                            }
                                        } catch (IOException | NullPointerException e3) {
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                    i = -1;
                                                } catch (IOException e4) {
                                                }
                                                if (i != -1) {
                                                }
                                                this.f6619c = cdz;
                                                cds.mo3762a(cdz);
                                            }
                                            i = -1;
                                            if (i != -1) {
                                            }
                                            this.f6619c = cdz;
                                            cds.mo3762a(cdz);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (IOException e5) {
                                                }
                                            }
                                            throw th;
                                        }
                                        if (i != -1) {
                                            cdz = new cdz(cdz, i);
                                        }
                                        this.f6619c = cdz;
                                        cds.mo3762a(cdz);
                                    }
                                    i = -1;
                                    if (i != -1) {
                                    }
                                    this.f6619c = cdz;
                                    cds.mo3762a(cdz);
                                }
                            }
                            cdz = null;
                            if (cdz != null) {
                            }
                            i = -1;
                            if (i != -1) {
                            }
                            this.f6619c = cdz;
                            cds.mo3762a(cdz);
                        }
                    } catch (SecurityException e6) {
                        if (cursor == null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                        }
                        throw th;
                    }
                }
            } catch (SecurityException e7) {
                cursor = null;
                if (cursor == null) {
                    cursor.close();
                    str = null;
                    if (!TextUtils.isEmpty(str)) {
                    }
                    cdz = null;
                    if (cdz != null) {
                    }
                    i = -1;
                    if (i != -1) {
                    }
                    this.f6619c = cdz;
                    cds.mo3762a(cdz);
                }
                str = null;
                if (!TextUtils.isEmpty(str)) {
                }
                cdz = null;
                if (cdz != null) {
                }
                i = -1;
                if (i != -1) {
                }
                this.f6619c = cdz;
                cds.mo3762a(cdz);
            } catch (Throwable th4) {
                th = th4;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (NullPointerException e8) {
            String valueOf = String.valueOf(uri);
            String valueOf2 = String.valueOf(fromFile);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(valueOf2).length());
            sb.append("NPE opening uri: ");
            sb.append(valueOf);
            sb.append(" -> ");
            sb.append(valueOf2);
            throw ((FileNotFoundException) new FileNotFoundException(sb.toString()).initCause(e8));
        } catch (FileNotFoundException e9) {
            cds.mo3761a((Exception) e9);
        }
    }
}
