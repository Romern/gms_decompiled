package p000;

import android.accounts.Account;
import android.content.ComponentName;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;

/* renamed from: mqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface mqc extends IInterface {
    /* renamed from: a */
    void mo19885a(Account account, byte[] bArr, byte[] bArr2, byte[] bArr3, ComponentName componentName, mqf mqf);

    /* renamed from: a */
    void mo19886a(Account account, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i, byte[] bArr6, ComponentName componentName, mqf mqf);

    /* renamed from: a */
    void mo19887a(String str, ParcelFileDescriptor parcelFileDescriptor, mqf mqf);

    /* renamed from: a */
    void mo19888a(String str, mqa mqa);

    /* renamed from: a */
    void mo19889a(String str, mqf mqf);

    /* renamed from: a */
    void mo19890a(mqf mqf);

    /* renamed from: b */
    void mo19891b(String str, mqa mqa);

    /* renamed from: b */
    void mo19892b(String str, mqf mqf);

    /* renamed from: b */
    void mo19893b(mqf mqf);

    /* renamed from: c */
    void mo19894c(String str, mqf mqf);

    /* renamed from: c */
    void mo19895c(mqf mqf);
}
