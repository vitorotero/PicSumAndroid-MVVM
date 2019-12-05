package br.com.tecapp.personproject.shared.manager

import br.com.tecapp.personproject.shared.api.ApiPhoto
import br.com.tecapp.personproject.shared.model.Photo
import br.com.tecapp.personproject.ui.viewmodel.PhotoViewModel
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class PhotoManagerTest {

//    lateinit var apiPhoto: ApiPhoto
//    lateinit var photoManager: PhotoManager
//
//    @Before
//    fun setup() {
//        apiPhoto = mock()
//        photoManager = PhotoManagerImp(apiPhoto)
//    }
//
//    @Test
//    fun test_requestApi_returnsListPhotos() {
//        val photoResponse = Observable.just(
//            listOf(
//                Photo(0, "png", "photo_one", "Vitor Otero", "github.com/vitorotero", "github.com/vitorotero"),
//                Photo(1, "jpeg", "photo_two", "Vitor Otero", "github.com/vitorotero", "github.com/vitorotero")
//            )
//        )
//
//        whenever(apiPhoto.listPhotos())
//            .thenReturn(photoResponse)
//
//        val requestResult = photoManager.listPhotos()
//
//        val testObserver = TestObserver<List<PhotoViewModel>>()
//        requestResult.subscribe(testObserver)
//        testObserver.assertComplete()
//        testObserver.assertNoErrors()
//        testObserver.assertValueCount(1)
//
//        val listResult = testObserver.values()[0]
//
//        assertEquals(listResult.size, 2)
//        assertEquals(listResult[0].fileName, "photo_one")
//        assertEquals(listResult[0].author, "Vitor Otero")
//        assertEquals(listResult[0].authorUrl, "github.com/vitorotero")
//        assertEquals(listResult[1].fileName, "photo_two")
//        assertEquals(listResult[1].author, "Vitor Otero")
//        assertEquals(listResult[1].authorUrl, "github.com/vitorotero")
//    }

}